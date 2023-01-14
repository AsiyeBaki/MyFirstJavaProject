package day06_ifStatements;

public class MaximumNumber {
    public static void main(String[] args) {

        int num1 = 1000;
        int num2 = 1000;

        if (num1 > num2 ){
            System.out.println(num1 + " is maximum number");
        }
        if(num2 > num1 ){
            System.out.println(num2 + " is maximum number");
        }
        if(num1 == num2){
            System.out.println("Equal");
        }


    }
}
