package shorts;

public class String_charAt_length {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        //indexes:    0123456789..

        char ch1 = str.charAt(11);  // for this ex: any number greater than 11 won't work since biggest index number is 11
        System.out.println(ch1);

        int l = str.length();
        // length will return you the number of the characters which is 12,
        // but last index number is length - 1 = 11, since it's starting from 0
        System.out.println(l);




    }
}
