package test.datastructure.list.test;

import datastructure.list.CustomArrayList;
import datatype.CustomQueue;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Queue;

public class CustomQueueTest {
    private Queue<Integer> queue = null;

    @Before
    public void setUp() throws Exception {
        queue = new CustomQueue(new CustomArrayList());
    }



    @Test
    public void shouldShowSize(){
        queue.add(1);
        queue.add(2);
        queue.add(4);

        assertEquals(3,queue.size());

    }

    @Test
    public void shouldBeEmpty(){

        assertEquals(true,queue.isEmpty());
    }






}
