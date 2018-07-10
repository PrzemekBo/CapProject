package datatype;

import datastructure.list.CustomArrayList;
import org.junit.Test;

import java.util.List;

/**
 * FIFO queue
 */
public class CustomQueue<T> extends AbstractCustomQueueAdapter<T> {
    CustomArrayList<T> storage = null;
    //TODO cczy ymieniac na array liste

    public CustomQueue(CustomArrayList<T> storage) {
        this.storage = storage;
    }
    @Override
    public int size() {
        return storage.size();

        //TODO yrobione testy
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
        //TODO Ymozna ladniej testy
    }

    @Override
    public boolean add(T t) {
          storage.add(t);
            return true;
            //TODO YRObic warunki wyjatki
    }

    @Override
    public T poll() {
         if (isEmpty()){
             return null;
         }else {
             T t=storage.get(0);
             storage.remove(0);
             return t;

         }
    }

    @Override
    public T peek() {
        if(isEmpty()){
            return null;
        }else{
            return storage.get(0);
        }

    }


}
