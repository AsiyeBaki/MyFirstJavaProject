package shorts;

public class String_equals_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("JAVA");

        System.out.println(str1 == str2);// false it will be checking the objects.
        // Even though they both are same in the String paranteces as "Java", they are 2 different objects in the heap memory outside of the pool
        System.out.println(str1.equals(str2));  // true   it will be checking the value to compare
        System.out.println(str2.equals(str3));  // true
        System.out.println(str3.equals(str4));  // false


    }
}
