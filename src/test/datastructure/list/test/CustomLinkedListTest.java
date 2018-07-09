package test.datastructure.list.test;


import datastructure.list.CustomLinkedList;
import org.junit.Before;
import org.junit.Test;


import java.util.Iterator;

import static org.junit.Assert.assertEquals;


public class CustomLinkedListTest {

    CustomLinkedList<Integer> list = null;

    @Before
    public void setup() {
        list = new CustomLinkedList<>();
    }




    @Test
    public void shouldShowSize() {

        //given

        //when

        //then

        //given
        list.add(2);
        list.add(3);
        list.add(5);

        //when
        Integer result = list.size();

        //then
        assertEquals (3,list.size());


    }
    @Test
    public void shouldBeEmpty(){

        Integer CONSTANT_ZERO=0;

        Integer result=list.size();
        assertEquals(CONSTANT_ZERO,result);

        //TODO nie jestem pewnz cz dobrye cz powinno byc true

    }

    @Test
    public void shouldclear(){

        Integer CONSTANT_ZERO=0;
        //given
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9);
        list.clear();

        //when
        Integer result = list.size();

        //then
        assertEquals (CONSTANT_ZERO,result);




    }

    @Test
    public void shouldGet(){
        Integer CONSTANT_FOUR=4;

        //given
        list.add(32);
        list.add(CONSTANT_FOUR);
        list.add(4);

        //when
        Integer result = list.get(1);

        //then
        assertEquals(CONSTANT_FOUR,result);
    }


    @Test
    public void removeTest(){
        list.add(4);
        list.add(3);
        list.add(42);
        list.add(44);
        list.remove(2);
        assertEquals(3,list.size());

    }

    @Test
    public void shouldContain(){
        list.add(56);
        list.add(182);
        list.add(42);
        assertEquals(true,list.contains(182));
        //TODO mozna troche ladniej
    }

    public void iteratorRemove(){
      //  Iterator<>iterator;


    }


}
