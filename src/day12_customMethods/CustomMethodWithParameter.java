package day12_customMethods;

public class CustomMethodWithParameter {
    public static void main(String[] args) {


        int number = 300;

        CustomMethodWithParameter.oddOrEven(300);


        String firstName = "Vasyl",
                lastName = "Dobrianski";


        CustomMethodWithParameter.initial(firstName, lastName);


        System.out.println("----------------------------");




        oddOrEven(100);
        System.out.println("---------------------------------");
        oddOrEven(45);
        System.out.println("---------------------------------");
        eligibleToBuyAlcohol(65);
        eligibleToBuyAlcohol(18);
        calculateGrade(45);
        calculateGrade(100);
        maxNumber(5.5,6.3);
        maxNumber(-440,-54);
        maxNumber(16000,15000);
        initial("Asiye" , "Baki");
        initial("Hasan" , "Ayhan");

    }

    // the method takes an argument number, and verifies if the number is odd number or even number
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }

    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are NOT eligible to buy alcohol");
        }
    }

    public static void calculateGrade(int score) {
        if (score >= 90 && score <= 100) {
            System.out.println("Excellent");
        } else if (score >= 80 && score < 90) {
            System.out.println("Great");
        } else if (score >= 70 && score < 80) {
            System.out.println("Good");
        } else if (score >= 60 && score < 70) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

    }


    public static void maxNumber(double n1, double n2) {
        if (n1 > n2) {
            System.out.println(n1 + " is maximum number");
        } else if (n2 > n1) {
            System.out.println(n2 + " is maximum number");
        } else {
            System.out.println("Numbers are equal");
        }
    }

    public static void initial (String firstName, String lastName) {
       String initial = firstName.charAt(0) + "." + lastName.charAt(0);
       System.out.println("initial is: " + initial);
       //(my way) String initial = firstName.substring(0, 1).toUpperCase() + lastName.substring(01).toUpperCase();

    }





}


// create a method that display the initials of a person(fristName,lastName)
// create a method that can print the maximum number between two numbers,if both are equal then it prints "Equal"(n1,n2)