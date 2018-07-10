package datastructure.list;



import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        CustomLinkedList<Integer>list=new CustomLinkedList<>();
        list.add(5);
        list.add(4);
        list.add(5);
        list.indexOf(4);

        System.out.println(list.indexOf(4));
    }
    }