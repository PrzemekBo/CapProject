package test.datastructure.list.test;

import datastructure.list.CustomArrayList;
import datastructure.list.CustomLinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;


public class CustomArrayListTest {


    CustomArrayList<Integer> arrayList = null;

    @Before
    public void setup() {
        arrayList = new CustomArrayList<Integer>();
    }


    @Test
    public void shouldReturnElementByIndex() {

        Integer CONSTANT_TWO = 2;

        //given
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(CONSTANT_TWO);
        arrayList.add(45);

        //when
        Integer i = arrayList.get(2);

        //then
        assertTrue(CONSTANT_TWO.equals(i));
    }

    @Test
    public void shouldRemoveElementByIndex() {
        arrayList.add(14);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.remove(1);
        assertEquals(3, arrayList.size());
    }

    @Test
    public void shouldExspectCorectSize() {
        //given
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(6);

        //when
        Integer result = arrayList.size();

        //then
        assertEquals(3, arrayList.size());
    }

    @Test
    public void shouldBeEmpty() {

        //given

        //when
        Boolean result=arrayList.size()==0;

        //then
        assertEquals(result,arrayList.isEmpty());

    }

    @Test
    public void shouldContainElement() {
        arrayList.add(52);
        arrayList.add(182);
        arrayList.add(42);
        arrayList.add(59);
        assertEquals(true, arrayList.contains(59));

    }

    @Test
    public void shouldclear() {

        Integer CONSTANT_ZERO = 0;
        //given
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(93);
        arrayList.clear();

        //when
        Integer result = arrayList.size();

        //then
        assertEquals(CONSTANT_ZERO, result);


    }

    @Test
    public void shouldGet() {
        Integer CONSTANT_FOUR = 4;

        //given
        arrayList.add(32);
        arrayList.add(CONSTANT_FOUR);
        arrayList.add(534);

        //when
        Integer result = arrayList.get(1);

        //then
        assertEquals(CONSTANT_FOUR, result);
    }

    @Test
    public void shouldRemoveByIndex() {
        arrayList.add(4);
        arrayList.add(37);
        arrayList.add(42);
        arrayList.add(44);
        arrayList.remove(2);
        assertEquals(3, arrayList.size());

    }


    @Test
    public void shouldCorrectSet() {
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(55);

        arrayList.set(2, 2);


        assertEquals(4, arrayList.size());
    }

    @Test
    public void shouldReturnindexOf() {

        Integer CONSTANT_TWO = 2;

        //given
        arrayList.add(5);
        arrayList.add(CONSTANT_TWO);
        arrayList.add(2);
        arrayList.add(533);

        //when
        Integer i = arrayList.indexOf(CONSTANT_TWO);

        //then
        assertEquals(1, arrayList.indexOf(CONSTANT_TWO));

    }

    @Test
    public void shouldAddElementByIndex() {

        arrayList.add(0, 2);
        arrayList.add(1, 48);
        arrayList.add(2, 4);
        arrayList.add(3, 264);


       // assertTrue(arrayList.add(6));

        assertEquals(4, arrayList.size());
    }

    @Test
    public void shouldRemoveObject(){



        //given
        arrayList.add(65);
        arrayList.add(2);
        arrayList.add(41);
        arrayList.add(938);

        //when
        Boolean i=arrayList.remove((new Integer(2)));

        ///then
        assertEquals(true,i);


    }

    @Test
    public void shoudCheckIfNextElementExist(){

        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(498);
        list.add(65);
        list.add(456);
        list.add(42);

        Iterator<Integer> iterator = list.iterator();


        assertEquals(true,iterator.hasNext());
        iterator.next();




    }








}
