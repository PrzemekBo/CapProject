package datatype;

import java.util.List;

/**
 * FIFO queue
 */
public class CustomQueue<T> extends AbstractCustomQueueAdapter<T> {
    List<T> storage = null;

    public CustomQueue(List<T> storage) {
        this.storage = storage;
    }

    @Override
    public int size() {
          /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return 0;
    }

    @Override
    public boolean isEmpty() {
          /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return false;
    }

    @Override
    public boolean add(T t) {
          storage.add(t);
            return true;
    }

    @Override
    public T poll() {
          /* (TODO Starterkit 1) Please introduce a sensible implementation */
        return null;
    }

    @Override
    public T peek() {
        if (isEmpty()){
            return null;
        }

        return null;
    }
}
