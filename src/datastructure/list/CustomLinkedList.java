package datastructure.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;


/**
 * List based on recursively related objects
 *
 * @param <T>
 */
public class CustomLinkedList<T> extends AbstractCustomListAdapter<T> {
    // head is the first element of linked list.
    private Node<T> head;
    // tail is the last element
    private Node<T> tail;
    private int length = 0;


    @Override
    public int size() {
        return this.length;

        //TODO zroibone testy

    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }
    //TODO zroibone testy

    @Override
    public boolean contains(Object o) {
        Node<T> temp = head;
        for(int i = 0; i<length; i++){
            if(temp.getData().equals(o)){
                return true;
            }
            temp = temp.next;
        }
        return false;
        //TODO Yrobione


    }




    @Override
    public Iterator<T> iterator() {
        return new CustomLinkedListIterator<>();
    }


    @Override
    public boolean add(T t) {
        if (isEmpty()) {
            head = new Node<>(t, null);
            tail = head;

        } else {
            tail.setNext(new Node<>(t, null));
            tail = tail.getNext();
        }
        length++;
        return true;

        //TODO yrobione testy
    }
    //TODO zrobione
    @Override
    public boolean remove(Object o) {
        if(contains(o)) {

            Node<T> temp = head;
            for (int i = 0; i < length; i++) {
                if (o.equals(temp.data)) {
                    if(temp.next == null){
                        temp = null;
                        length--;
                        return true;
                    }else {
                        temp.data = temp.next.data;
                        temp.next = temp.next.next;
                        length--;
                        return true;
                    }
                }
                temp = temp.next;
            }
        }
        return false;
    }
    //TODO yrobione
    @Override
    public void clear() {
        head = null;
        tail = null;
        length = 0;
    }

    //TODo dyiala
    @Override
    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index < size() - 1) {
            Node<T> current = head;
            for (int j = 0; j < index; j++) {
                current = current.getNext();
            }
            return current.getData();
        }
        return tail.getData();


    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        Node<T> previous = tmp;
        tmp.data = element;
        return (T) previous;

        //TODO yrobione testy
    }

    //TODo zrobione
    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size() - 1) {
            add(element);
            return;
        }
        if (index == 0) {
            head = new Node<>(element, head);
        } else {
            Node<T> current = head;
            for (int j = 0; j < index - 1; j++) {
                current = current.getNext();
            }
            current.setNext(new Node<>(element, current.getNext()));
        }
        length++;
    }

    @Override
    public T remove(int index) {
        if(index>= size())
            throw new IndexOutOfBoundsException();
        Node<T> temp = head;

        if(index == 0){
            Node<T> prev = temp;
            head = temp.next;
            length--;
            return prev.data;
        }

        for(int i = 0; i < (index-1); i++){
            temp = temp.next;
        }
        Node<T> prev = temp.next;
        temp.next = temp.next.next;
        length--;
        return  prev.data;

        //TODO testy zrobione
    }


//TODO nie dziala
    @Override
    public int indexOf(Object o) {
        if(contains(o)) {
            Node<T> tmp = head;
            for (int i = 0; i < length; i++) {
                if(tmp.getData().equals(o)){
                    return i;
                }
                tmp = tmp.next;
            }
        }
        return -1;
    }

    /**
     * Iterator for CustomLinkedList
     */
    private class CustomLinkedListIterator<E> implements Iterator<E> {

        private Node<T> current;
        private Node<T> previous;
        private Node<T> beforePrevious;
        private  boolean removeCalledElement;


        public CustomLinkedListIterator() {
            current = head;
            previous = null;
            beforePrevious = null;
            removeCalledElement=false;
        }

        @Override
        public boolean hasNext() {
            if (current.getNext()!=null){
                return true;
            }

            return false;
        }

        @Override
        public E next() {
            if (current == null) {
                throw new NoSuchElementException();
            }

            E temp = (E) current.getData();
            beforePrevious = previous;
            previous = current;
            current = current.getNext();
            removeCalledElement=false;
            return temp;

        }

        @Override
        public void remove() {
            if (previous == null) {
                throw new IllegalStateException();
            }
            if (beforePrevious == null) {
                head = beforePrevious;
            } else {
                beforePrevious.setNext(current);
            }
            length--;
            removeCalledElement =true;
        }
    }
}