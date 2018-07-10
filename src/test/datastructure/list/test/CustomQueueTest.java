package test.datastructure.list.test;

import datastructure.list.CustomArrayList;
import datatype.CustomQueue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Queue;

public class CustomQueueTest {
    private CustomQueue<Integer> queue = null;

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

    @Test
    public void shouldRetrievesTheHead() {


        Integer CONSTANT_TWELVE=12;
        //given
        queue.add(CONSTANT_TWELVE);
        queue.add(54);
        queue.add(32);
        //when
        Integer i = queue.peek();
        //then
        assertTrue(CONSTANT_TWELVE.equals(i));
        //assertEquals(CONSTANT_TWELVE,queue.peek());

    }
    @Test
    public void shouldRetrievesAndRemoveTheHead() {

        Integer CONSTANT_TWELVE=12;

        //given
        queue.add(CONSTANT_TWELVE);
        queue.add(54);
        queue.add(42);

        //when
        Integer i=queue.poll();
        //then
        assertTrue(CONSTANT_TWELVE.equals(i));
    }







}
