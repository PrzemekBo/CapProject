package test.datastructure.list.test;


import datastructure.list.CustomArrayList;
import datastructure.list.CustomLinkedList;
import datastructure.list.FilterIterator;
import org.junit.Test;

import java.util.List;


import static org.junit.Assert.assertFalse;


public class FilterIteratorTest {


    private List<Integer> createEmptyList() {

        return new CustomArrayList<>();
    }


    @Test
    public void shouldBeEmpty() {

        List<Integer> list = createEmptyList();

        FilterIterator<Integer> it = new FilterIterator<>(list, (x) -> x > 2);


        assertFalse(it.hasNext());
    }

}
