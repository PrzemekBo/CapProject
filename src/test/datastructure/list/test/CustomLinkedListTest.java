package test.datastructure.list.test;


import datastructure.list.CustomLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.Iterator;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class CustomLinkedListTest {

    CustomLinkedList<Integer> list = null;


    @Before
    public void setup() {
        list = new CustomLinkedList<>();
    }





    @Test
    public void shouldExspectCorectSize() {


        //given
        list.add(2);
        list.add(3);
        list.add(5);

        //when
        Integer result = list.size();

        //then
        assertEquals(3, list.size());


    }

    @Test
    public void shouldBeEmpty() {

        //given

        //when
        Boolean result=list.size()==0;

        //then
        assertEquals(result,list.isEmpty());

    }



    @Test
    public void shouldclear() {

        Integer CONSTANT_ZERO = 0;
        //given
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9);
        list.clear();

        //when
        Integer result = list.size();

        //then
        assertEquals(CONSTANT_ZERO, result);


    }

    @Test
    public void shouldGet() {
        Integer CONSTANT_FOUR = 4;

        //given
        list.add(32);
        list.add(CONSTANT_FOUR);
        list.add(4);

        //when
        Integer result = list.get(1);

        //then
        assertEquals(CONSTANT_FOUR, result);
    }


    @Test
    public void shouldremoveByIndex() {
        list.add(4);
        list.add(3);
        list.add(42);
        list.add(44);
        list.remove(2);
        assertEquals(3, list.size());

    }

    @Test
    public void shouldContainElement() {
        list.add(56);
        list.add(182);
        list.add(42);
        list.add(59);
        assertEquals(true, list.contains(59));

    }


    @Test
    public void shouldSet() {
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);

        list.set(2, 2);


        assertEquals(4, list.size());
    }

    @Test
    public void shouldReturnindexOf() {

        Integer CONSTANT_TWO = 2;

        //given
        list.add(5);
        list.add(CONSTANT_TWO);
        list.add(2);
        list.add(53);

        //when
        Integer i = list.indexOf(CONSTANT_TWO);
        assertEquals(1, list.indexOf(CONSTANT_TWO));

        //then

        //  assertTrue(CONSTANT_TWO.equals(i));
        // assertEquals(true,list.indexOf(CONSTANT_TWO));

    }
    @Test
    public void shouldAddElementByIndex() {

        list.add(0, 2);
        list.add(1, 43);
        list.add(2, 4);
        list.add(3, 264);

        assertEquals(4, list.size());
    }

    @Test
    public void shouldReturnElementByIndex() {

        Integer CONSTANT_TWO = 2;

        //given
        list.add(4);
        list.add(3);
        list.add(CONSTANT_TWO);
        list.add(45);

        //when
        Integer i = list.get(2);

        //then

        Assert.assertTrue(CONSTANT_TWO.equals(i));

    }

    @Test
    public void shouldClearList() {

        //given
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(5);

        list.clear();

        Integer result=list.size();
        ///then
        assertEquals(0, list.size());
    }

    @Test
    public void shouldRemoveObject(){



        //given
        list.add(65);
        list.add(2);
        list.add(41);
        list.add(98);

        //when
        Boolean i=list.remove((new Integer(2)));

        ///then
        assertEquals(true,i);


    }

    @Test
    public void shoudCheckIfNextElementExist(){

        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(498);
        list.add(65);
        list.add(46);
        list.add(42);

        Iterator<Integer> iterator = list.iterator();




        assertEquals(true,iterator.hasNext());
        iterator.next();



       // assertEquals(true,iterator.hasNext());
    }




}


