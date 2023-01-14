package day38_throws_keyword;


import utilities.Library;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {

        System.out.println("Hello Cydeo");

        // Thread.sleep(3500);
        Library.sleep(3.5);
        System.out.println("How are you today?");
        System.out.println("----------------------------");

        if(LocalTime.now().equals(LocalTime.of(4,0))){
            throw new BreaktimeException(); // at 4 pm it is going to throw this exception
        }
       // throw new RuntimeException("Something went wrong");
        // throw new BreakTimeException("It is time to go home");

        throw new BreaktimeException("Time to go home");






    }
}
