package test.datastructure.list.test;


import datastructure.list.CustomArrayList;

import datatype.CustomStack;
import org.junit.Before;
import org.junit.Test;

import java.util.Deque;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CustomStackTest {

    private CustomStack<Integer> stack = null;

    @Before
    public void setup() throws Exception {
        stack = new CustomStack(new CustomArrayList());
    }


    @Test
    public void shouldShowCorectSize() {


      //given
        stack.push(2);
        stack.push(3);
        stack.push(64);

        //when
       // Integer result = stack.size();

        //then
        assertEquals(3, stack.size());
    }



    @Test
    public void shouldBeEmpty() {

       assertEquals(true, stack.isEmpty());
    }

  /*  @Test
    public void shouldRetrievesTheHead() {


        Integer CONSTANT_TWELVE = 12;
        //given
        stack.push(2);
        stack.push(54);
        stack.push(CONSTANT_TWELVE);
        //when
        Integer i = stack.peek();
        //then
        assertTrue(CONSTANT_TWELVE.equals(i));
        //assertEquals(CONSTANT_TWELVE,queue.peek());
*/
    }




