package day03_variables;

public class VariableNamingRules {

    /*
    1.must be READABLE, UNDERSTANDABLE and MEANINGFUL
    2.must be UNIQUE
    3.apply CamelCase , space can NOT be used, underscore( _ ) can be used
    4.can not have special characters other _ or $
    5. variable can NOT START with digits
    6. Variables can not be Java reserved words

     */

    public static void main(String[] args) {
        // age of student is 28
        // salary is 10000

        int age = 28;
        int salary = 10000;
        // int age = 32; // variable name must be unique

        int phoneNumber = 123456789;  //camelCase

        double salaryBeforeTax = 100000.5;

        double salary_after_tax = 80000.5;

        System.out.println("-------------------------");

        int number = 10;
        int number2 = 20;
        int number3 = 30;

        // double abstract = 5.5; // variable named can not be Java reserved words

        System.out.println("--------------------------");


        // gender is male
        String gender = "Male";
        String fullName = "Cydeo School";

        System.out.println(gender);
        System.out.println(fullName);


        // String: String of Texts " "









    }


}
