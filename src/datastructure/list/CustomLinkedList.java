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

    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (T t : this) {
            if (o == null ? t == null : o.equals(t)) {
                return true;
            }
        }
        return false;
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
    }

    @Override
    public boolean remove(Object o) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return false;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        length = 0;
    }

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
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return null;
    }

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
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
        Iterator<T> iterator = this.iterator();
        for (int j = 0; index < j; j++) {
            iterator.next();
        }
        T t = iterator.next();
        iterator.remove();
        return t;
    }

    @Override
    public int indexOf(Object o) {
        /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return 0;
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

            return current != null;
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
            removeCalledElement=true;
        }
    }
}



