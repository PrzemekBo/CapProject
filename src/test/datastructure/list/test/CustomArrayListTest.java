package test.datastructure.list.test;

import datastructure.list.CustomArrayList;
import org.junit.Before;
import org.junit.Test;
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



}
