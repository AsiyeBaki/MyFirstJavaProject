package day14_overloadingMethod_loops;

public class WarmupTasks {
    public static void main(String[] args) {

        String str3 = combine("One", "eight");
        System.out.println(str3);
        System.out.println(combine("Asiye", "Baki"));
        System.out.println("combine of your name is: " + combine("java", "apple"));

        String s1 = "" + true; // you can concatenation anything to String by adding "" and empty string
        String s2 = "" + 'e';
        System.out.println(s1 + s2);
        System.out.println(sumOf3Integers(10, 20, 30) + 40);
        System.out.println(sumOf4Integers(10, 20, 30, 40));
        System.out.println(sumOf2Integers(sumOf3Integers(10, 20, 30), 40));
        System.out.println(sumOf2Integers(sumOf4Integers(10, 20, 30, 40), sumOf4Integers(10, 20, 30, 40)));
    }

    public static String combine(String str1, String str2) {
        String result;
        if (str1.endsWith(""+ str2.charAt(0))) {
            return result = str1 + str2.substring(1); // we added "" to convert char to a String
        } else {
            return result = str1 + str2;
        }
    }

    public static int sumOf2Integers(int n1, int n2) {
        return n1 + n2;
    }

    public static int sumOf3Integers(int n1, int n2, int n3) {
        return sumOf2Integers(n1, n2) + n3;
    }

    public static int sumOf4Integers(int n1, int n2, int n3, int n4) {
        // return n1 + n2 + n3 + n4;
        // return sumOf3Integers(n1, n2, n3) + n4;
        // return sumOf2Integers(n1,n2) + sumOf2Integers(n3,n4);
        return sumOf2Integers(sumOf3Integers(n1, n2, n3), n4);
    }


}
