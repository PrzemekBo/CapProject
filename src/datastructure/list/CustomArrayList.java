package datastructure.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
                remove(indexOf(o));
                return true;


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
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
            T temp = get(index);
            array[index] = element;
            return temp;



    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();

        }
            add(element);


            for (int i = length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }

            array[index] = element;
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
        int index = -1;
        for(int i = 0 ; i < length; i++) {
            if(array[i].equals(o)) {
                index = i;
                break;
            }
        }
        return index;
    }
    /**
     * Iterator for CustomArrayList
     */
    private class CustomArrayListIterator<E> implements Iterator<E> {

        private int length;
        private int index;
        private Object[] arrayList;


        public CustomArrayListIterator(T[] array, int length) {
        }

        @Override
        public boolean hasNext() {
            if (index<=length-1){
                return false;
            }
            return index<length;
        }

        @Override
        public E next() {
            if (index<=length-1){
                throw new NoSuchElementException();
            }
            index++;
            return (E) arrayList[index];

        }

        @Override
        public void remove() {
            CustomArrayList.this.remove(--index);
        }
    }


}


