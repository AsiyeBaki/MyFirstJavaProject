package day13_customMethodsContinue;

public class WarmUpTasks {
    public static void main(String[] args) {

        calculate(13, 43, '*');
        calculate(54, 74, '-');
        calculate(5, 10, '+');
        calculate(5, 6, '&');
        calculate(8, 8, '/');
        System.out.println("-----------------");
        ageGroup(151);
        ageGroup(-4);
        ageGroup(56);
        ageGroup(13);
        ageGroup(31);
        System.out.println("------------------");
        eligibleToVote(23,true);


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your two numbers and a math operator:");
//
//        double n1 = scan.nextDouble(),
//                n2 = scan.nextDouble();
//        char operator = scan.next().charAt(0);
//
//        calculate(n1, n2, operator);

    }

    /*
    3. Create a method named eligibleToVote that takes two arguments:
	        1. age (int)
	        2. isAmerican (boolean)
	    Then the method should determine if the person eligible to vote
	        Ex:
	            eligibleToVote(23, true)
	        output:
	            You are eligible to vote
     */
    public static void eligibleToVote(int age, boolean isAmerican) {

        String isEligibleToVote = (age >= 21 && isAmerican) ? "You are eligible to vote" : "You are not eligible to vote";
        System.out.println(isEligibleToVote);
    }


    /*
       1. Create a method named calculate that can take three arguments:
           num1 (double)
           num2 (double)
           mathOperator (char)
       The method should display the calculation result of those two numbers as long as the 3rd argument is a valid math operator, otherwise the method prints "Invalid Operator"
           Ex:
               calculate(10, 20, '+')
           output:
               10 + 20 = 30
        */
    public static void calculate(double num1, double num2, char mathOperator) {
        // double float long boolean can not be used at switch
        // double result = 0;  or
        switch (mathOperator) {
            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operator: " + mathOperator);
        }
    }


    /*
        2. Create a method named ageGroup that can print the age group of the person
	        age groups are:
	                Teenager (< 21)
	                Adult   (>=21 && <55 )
	                Senior  ( > 55 )
         */
    public static void ageGroup(int age) {

        if (age > 0 && age < 150) {

            System.out.println((age < 21)? "Teenager" : (age < 55)? "Adult" : "Senior");

        } else {
            System.out.println("Invalid age: " + age);
        }


    }


}