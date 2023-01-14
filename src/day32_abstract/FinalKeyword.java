package day32_abstract;

import java.time.LocalDate;

 class Student {
    public final void language() { // if you want this implementation not be changed , give final
        System.out.println("Java Programming");
    }
// applying final keyword to the static is pointless, we never need to override the static methods

}

public class FinalKeyword extends Student {
/*
    public void language() {  // if we give final to the method language() in CydeoStudent class, final method can not be overridden
        System.out.println("Python Programming");
    }

 */
    public FinalKeyword(){

    }

    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender);   // M
       //  gender = 'F';

        System.out.println(gender);   // F

        System.out.println("----------------");

        LocalDate dateOfBirth = LocalDate.now();
        System.out.println(dateOfBirth);
        dateOfBirth = dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth);

        System.out.println("======================");

        new Student().language(); // Java Programming
        new FinalKeyword().language(); // Python Programming


        System.out.println("--------------------");
        String name = "James";
        // name = null;
        name = "Daniel";
        System.out.println(name);


    }
}
