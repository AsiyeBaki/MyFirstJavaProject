package day19_arraysIntro;

public class MinNumber {
    public static void main(String[] args) {


        int [] numbers = {100, 30, 500, -10, 20, 75};
        int min = numbers[0]; // we are giving the first element as a min number, then loop will replace it with other numbers

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);


    }
}
