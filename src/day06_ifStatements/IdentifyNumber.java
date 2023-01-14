package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = 200;

        boolean isPositive = number > 0;  // if the number greater than zero
        boolean isNegative = number < 0;  // if the number is smaller than zero
        // boolean isZero = number == 0;
        boolean isZero = !isNegative && !isPositive;

        System.out.println(number+" is a positive number: "+isPositive);
        System.out.println(number+" is a negative number: "+isNegative);
        System.out.println(number+" is zero: "+isZero);








    }
}
