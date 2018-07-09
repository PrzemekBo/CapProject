package datatype;

import java.util.EmptyStackException;
import java.util.List;

/**
 * Stack, LIFO queue
 */
public class CustomStack<T> extends AbstractCustomStackAdapter<T> {
    List<T> storage = null;

    /* (TODO Starterkit 1) Please introduce a sensible implementation */
    public CustomStack(List<T> storage) {
        this.storage = storage;
    }

    @Override
    public void push(T t) {
        storage.add(t);

    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T t = storage.get(size() - 1);
        storage.remove(size() - 1);
        return t;


    }



    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public boolean isEmpty() {

        return storage.isEmpty();
    }
}
