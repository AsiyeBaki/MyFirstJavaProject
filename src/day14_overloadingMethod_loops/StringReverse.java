package day14_overloadingMethod_loops;

public class StringReverse {
    public static void main(String[] args) {

        // interview question !!!!

        String str = "Muhtar";
        //            01234

        //"avaJ

        String reverse = "";   //"avaJ"
        for (int i = str.length() - 1; i >= 0; i--) {  // (int i = 3; i >= 0; i--) if we put 3 that means the word is 4 character,
            // what if we have more characters? this is the bug.
            reverse += str.charAt(i);
        }


        System.out.println(reverse);
        System.out.println("--------------------------------------------");

        String name = "Ermek keneshbekovich Apazov";

        String result = reverse(name);  // this reverse can accept the String

        System.out.println(result);



    }

    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {   /// this method has created to reverse the String
            reverse += str.charAt(i);
        }
        return reverse;
    }

}
