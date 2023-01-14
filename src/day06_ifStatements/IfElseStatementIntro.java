package day06_ifStatements;

public class IfElseStatementIntro {
    public static void main(String[] args) {

        // when there is ONLY 2 statements, not more not less
        int age = 28;

        if( age >= 21){
            System.out.println("Eligible");
        }
        if(age <= 21){
            System.out.println("NOT Eligible");
        }

        System.out.println("----------------");


        if(age >= 21){
            System.out.println("ELigible");
        }else{
            System.out.println("NOT Eligible");
        }




    }
}
