package test.datastructure.list.test;


import datastructure.list.CustomLinkedList;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class CustomLinkedListTest {

    CustomLinkedList<Integer> list = null;

    @Before
    public void setup() {
        list = new CustomLinkedList<>();
    }


    @Test
    public void sizeTest() {
        list.add(2);
        list.add(3);


        int result = list.size();
        assertEquals (2,list.size());


    }
    @Test
    public void isEmptyTest(){
        int result=list.size();
        assertEquals(0,result);

    }

    @Test
    public void clearTest(){

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9);

        list.clear();

        int result=list.size();
        assertEquals(0,result);


    }

    @Test
    public void getTest(){
        int ymienna=4;

        list.add(ymienna);
        list.add(3);

        list.get(1);

        //assertEquals(ymienna,list.get(1);)
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


}
