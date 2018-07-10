package datastructure.list;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Filter iterator
 */
public class FilterIterator<T> implements Iterator<T> {
    private List<T> list;
    private int current;

    public FilterIterator(List<T> list, Predicate<T> predicate) {
        this.list = list.stream().filter(predicate).collect(Collectors.toList());
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return current < list.size();

    }

    @Override
    public T next() {

        return list.get(current++);

    }


    @Override
    public void remove() {
        list.remove(current);
        throw new UnsupportedOperationException();
    }
}
