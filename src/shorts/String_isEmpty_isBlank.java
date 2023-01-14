package shorts;

public class String_isEmpty_isBlank {
    public static void main(String[] args) {

        // isEmpty method is one of the special methods which return boolean value
        // String str =""; it will return true
        // String str1 ="    "; false

        String str = "     ";
        System.out.println(str.isEmpty());  // false
        System.out.println(str.isBlank());  // true


    }
}
