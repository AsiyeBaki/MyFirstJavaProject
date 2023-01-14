package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            // System.out.println(i); // if  print statement is here, if statement is useless
            if (i == 4)
                continue;
            System.out.println(i);
        }

        System.out.println("------------------------");
        for (int i = 10; i < 21; i++) {
            if ((i % 2) == 0) {
                continue; // skips the current iteration
            }
            System.out.println(i);  // it needs to be in the for loop method in order to print
        }
        System.out.println("-----------------------");

        for (char i = 'A'; i <= 'G'; i++) {
//            if(i =='B')
//                continue;
//
//            if(i =='E')
//                System.out.println(i);   //OR

            if (i == 'B' || i == 'E') {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("--------------------------");
        // find the sum of all the even number between 50~100

        // first way
        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0)
            System.out.print(i + " ");
        }

        System.out.println();   // this empty print statement will give it a new line
        //second way
        // 50, 52, 54, .. 100
        for (int i = 50; i < 101; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();  // this empty print statement will give it a new line
        //third way //

        for (int i = 50; i < 101; i++) {
            if (i % 2 != 0){
                continue;
            }
            System.out.print(i + " ");
        }


    }
}
