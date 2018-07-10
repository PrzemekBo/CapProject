package test.datastructure.list.test;


import datastructure.list.CustomLinkedList;
import org.junit.Before;
import org.junit.Test;


import static junit.framework.TestCase.assertTrue;
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
    public void shouldremoveByIndex(){
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
        list.add(59);
        assertEquals(true,list.contains(59));
        //TODO NIE uwzglednia ostatniego
    }


    @Test
    public void shouldSet(){
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);

        list.set(2,2);


        assertEquals(4,list.size());
    }


    @Test
    public void shouldReturnindexOf(){



        Integer CONSTANT_TWO=2;

        //given
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(53);

        //when

        Integer i=list.indexOf(2);
       // assertEquals(3,list.indexOf(2));

        //then

      //  assertTrue(CONSTANT_TWO.equals(i));
        assertEquals(true,list.indexOf(CONSTANT_TWO));
    }




    //Integer i=list.

    //given
     //   arrayList.add(4);
       // arrayList.add(3);
       // arrayList.add(CONSTANT_TWO);
       // arrayList.add(45);

    //when
   // Integer i=arrayList.get(2);

    //then

  //  assertTrue(CONSTANT_TWO.equals(i));






}
