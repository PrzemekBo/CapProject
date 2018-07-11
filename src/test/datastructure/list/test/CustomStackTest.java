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


    }




