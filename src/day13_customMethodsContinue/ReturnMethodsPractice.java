package day13_customMethodsContinue;

public class ReturnMethodsPractice {
    public static void main(String[] args) {


        System.out.println(issOdd(100));
        int num = 2155;
        if(isEven(num)){
            System.out.println(num + " is even number");
        } else {
            System.out.println(num);
        }

    }

    /*
    create a method isOdd, that can return true if a number is an odd number
     */
    public static boolean issOdd (int num) {
        //return (num % 2 != 0)? true : false;
        if (num % 2 != 0){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isEven (int num) {
        return !issOdd(num);
        // or  return (num % 2 == 0)? true : false;
    }

    public static int max (int n1, int n2) {
        // return n1 > n2 ? n1 : n2;

        if (n1>n2){
            return n1;
        } else {
            return n2;
        }



    }





}
