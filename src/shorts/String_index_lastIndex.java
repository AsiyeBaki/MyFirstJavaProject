package shorts;

public class String_index_lastIndex {
    public static void main(String[] args) {


        // index of method of the string

        String str = "Java Programming Language";
        //            0123456789 10 11 .... 22 23 24
        int index1 = str.indexOf("a");
        // since there is more than one a, we need to make it unique.
        // EX: "a" will return as 1, "a " will return as 3 , "amm" will return as 10 , ...

        // index number starts looking from left to right,
        System.out.println(index1);  // "a" will return 1, since it will be looking from left to right

        // last index number starts looking from right to left,
        int index2 = str.lastIndexOf("a"); // "a" will return 22, since it will be looking from right to left
        System.out.println(index2);

    }
}
