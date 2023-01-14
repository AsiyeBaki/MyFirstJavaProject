package day39_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_demo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(); // Array Based Class==> what is faster get()

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        LinkedList<Integer> linkedList = new LinkedList<>(); // Node based Class(doubly class)==> what is faster : add(), addAll(), remove(),removeAll(),
        //if we do List<Integer> linkedlist = new LinkedList<>(); polymorphism here, parent is referencing the child class


        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        System.out.println("---------");


        Vector<Integer> vector = new Vector<>();

        vector.add(5);
        vector.get(0);








    }
}
