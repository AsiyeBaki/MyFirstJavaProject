package day23_arrayList;

import java.util.ArrayList;

public class AverageNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(13);
        list.add(35);
        list.add(67);
        list.add(83);

        System.out.println(list);

        int sum = 0;

        for (Integer each : list) {
            sum+= each;
        }

        double average = sum / (double)list.size();
        System.out.println("average = " + average);


    }

}


/*
2. Write a program that can find the average number from an arrayList of integers
 */