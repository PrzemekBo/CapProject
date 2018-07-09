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
    public void shouldReturnElementByIndex(){

        Integer CONSTANT_TWO=54;

        //given
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(CONSTANT_TWO);
        arrayList.add(45);

        //when
        Integer i=arrayList.get(2);

        //then

        assertTrue(CONSTANT_TWO.equals(i));


    }

    @Test
    public void shouldRemoveElementByIndex(){
        arrayList.add(14);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(7);
        arrayList.remove(1);
        assertEquals(3,arrayList.size());
    }
}
