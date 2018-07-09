package datastructure.list;

import java.util.Iterator;

/**
 * List based on the table
 *
 * @param <T>
 */
public class CustomArrayList<T> extends AbstractCustomListAdapter<T> {


    private static final int DEFAULTCAPACITY = 10;

    private T []array;
    int length;

    public CustomArrayList() {
        array=(T[])new Object[DEFAULTCAPACITY];
        length=0;
    }

    public CustomArrayList(int initialCapacity) {
        array=(T[]) new Object [initialCapacity];
        length=0;

    }

    @Override
    public int size() {
        return length;

    }

    @Override
    public boolean isEmpty() {
        if (length==0) {
            return true;

        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (Object object:array){
            if (o.equals(object)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {

        Iterator<T>iterator=new CustomArrayListIterator<>(array,length);
        return  iterator;
    }

    @Override
    public boolean add(T t) {
        increaseTheSize();
        array[length++]=t;
        return true;
    }

    public void increaseTheSize(){
        T[]newArray;
        if (array.length*0.9<=size()){
            newArray= (T[]) new Object[array.length*3];
            for (int i=0;i<length;i++){
                newArray[i]=array[i];
            }
            array=newArray;
        }
    }
    public void decreaseTheSize(){
        T[]newArray;
        if (array.length*0.6<=size()){
            newArray= (T[]) new Object[array.length*3];
            for (int i=0;i<length;i++){
                newArray[i]=array[i];
            }
            array=newArray;
        }
    }

    @Override
    public boolean remove(Object o) {
        decreaseTheSize();
        for (Object object:array){
            if (o.equals(object)){
                remove(o);
                return true;
                /* (TODO Starterkit 1) Please introduce a sensible implementation */

            }
        }
        return false;
    }

    @Override
    public void clear() {
       length=0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }else{
            return array[index];
        }


    }

    @Override
    public T set(int index, T element) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return null;
    }

    @Override
    public void add(int index, T element) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
    }

    @Override
    public T remove(int index) {
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
        T previous = (T) array[index];
        while(index+1 < length) {
            array[index] = array[index + 1];
            index++;
        }
        length--;
        decreaseTheSize();
        return previous;
    }



    @Override
    public int indexOf(Object o) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return 0;
    }

    /**
     * Iterator for CustomArrayList
     */
    private class CustomArrayListIterator<E> implements Iterator<E> {

        public CustomArrayListIterator(T[] array, int length) {
        }

        @Override
        public boolean hasNext() {
             /* (TODO Starterkit 1) Please introduce a sensible implementation */
            return false;
        }

        @Override
        public E next() {
             /* (TODO Starterkit 1) Please introduce a sensible implementation */
            return null;
        }

        @Override
        public void remove() {
             /* (TODO Starterkit 1) Please introduce a sensible implementation */
        }
    }
}
