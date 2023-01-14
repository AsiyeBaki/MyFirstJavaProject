package day06_ifStatements;

public class MinimumNumber {
    public static void main(String[] args) {

        int num1 = 70;
        int num2 = 30;

        if(num1 < num2){
            System.out.println(num1 + " is minimum number");
        }
        if(num2<num1){
            System.out.println(num2 + " is minimum number");
        }
        if(num1==num2){
            System.out.println("Equal");
        }
    }
}
