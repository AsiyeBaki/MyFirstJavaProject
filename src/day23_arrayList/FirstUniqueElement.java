package day23_arrayList;

import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);

        System.out.println(list);




        for (Integer element : list) { // this to get each element in the list

            int frequency = 0;
            for (Integer each : list) { // this is for frequency
                if (each == element) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(element);
                break; // this is for exiting the loop, to be able to find the FIRST unique element, after first time loop will get executed
            }
        }


    }

}

/*
3. Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2
 */
