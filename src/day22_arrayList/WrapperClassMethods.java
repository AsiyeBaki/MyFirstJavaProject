package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "20";
        System.out.println(str + 1);

        // Integer num1 = Integer.parseInt(str);
        int num1 = Integer.parseInt(str);

        System.out.println(num1);
        System.out.println(num1 + 1);


        Integer num2 = Integer.valueOf(str);
        System.out.println(num2);
        System.out.println("---------------------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s);  // it will return you primitive value
        Double num4 = Double.valueOf(s);   // It will return you a String value // since it return you a wrapper class value we can assign it back to the wrapper class
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        System.out.println("----------------");

        // String x = "true";  // it will return true
        String x = "maybe";  // it will return false

        boolean x1 = Boolean.parseBoolean(x);
        Boolean x2 = Boolean.valueOf(x);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        System.out.println("----------------------------------");
        // Methods for char character
        char ch = '1';

        boolean isDigit = Character.isDigit(ch);
        System.out.println("isDigit = " + isDigit);

        boolean isLetter = Character.isLetter(ch); // since it returns you boolean we can assign it to a boolean variable
        System.out.println("isLetter = " + isLetter);

        boolean isLowerCase = Character.isLowerCase(ch);  // it will return you a boolean value

        boolean isUpperCase = Character.isUpperCase(ch); // it will return you a boolean value

        System.out.println("isLowerCase = " + isLowerCase);
        System.out.println("isUpperCase = " + isUpperCase);

        boolean isSpecialChar = !Character.isLetterOrDigit(ch); //  if char is a character it will return false, not letter not digit

        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("------------------------------------");

        String string = "a1b2c3d4e5";
        int sum = 0;

        for (char eachChar : string.toCharArray()) {
            if (Character.isDigit(eachChar)) {
                sum += Integer.parseInt("" + eachChar); // it will return you the sum of the numbers in the string
            }

        }
        System.out.println("sum = " + sum);

    }
}
