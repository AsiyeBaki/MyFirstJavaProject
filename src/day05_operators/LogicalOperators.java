package day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        //  Logical AND   &&
        //  Logical OR    ||
        //  Logical NOT   !
        // All logical operators return boolean (true or false)
        double salary = 60_000;
        double creditScore = 650;
        int age = 42;
        boolean eligibleForLoan = salary >= 30_000 && creditScore >= 650 && age >=18;
         //                               true     &&        true       && true

        System.out.println(eligibleForLoan);


        System.out.println(eligibleForLoan);
        System.out.println("---------------");

        age = 18;
        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA";
        //                         true    &&       true
        System.out.println(eligibleToVote);

        System.out.println("----------------------");

        String answer = "yes";

        boolean validAnswer = answer == "yes" && answer == "no";

        System.out.println(validAnswer);

        System.out.println("-------------------------");

        char grade = 'B';
        boolean passedTheExam = grade == 'A' || grade== 'B' || grade== 'C' || grade== 'D';

        System.out.println(passedTheExam);

        System.out.println("---------------");

        System.out.println(!true);


        int score = 65;

        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

        System.out.println("------------------");

        System.out.println(  true == !false && false == !true &&  true != !true );
        //                      true        &&      true      &&     true
        // since all of them are true, final value will be true
































    }

}
