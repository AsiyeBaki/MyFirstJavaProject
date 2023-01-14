package utilities;

public class StringUtility {

    public static String reverse(String str) {
        String reverse = "";  // to contain all the characters of the given string in reverse order

        for (int i = str.length() - 1; i >= 0; i--) {  // i: index number of the given string starting from last index to index 0
            // in order to get the index number of the string
            reverse += str.charAt(i);  // to get each character of the string
        }
        return reverse;
    }


    public static int frequency(String sentence, String word){

        int count = 0;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }

        return count;
    }



    public static int frequency(String str, char ch){
        int count =0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }

        return count;

    }

    public static String removeDup(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)) {
                result += each;
            }

        }

        return result;
    }

    public static String combine(String str1, String str2) {
        String result;
        if (str1.endsWith(""+ str2.charAt(0))) {
            return result = str1 + str2.substring(1); // we added "" to convert char to a String
        } else {
            return result = str1 + str2;
        }
    }




    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }

    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are NOT eligible to buy alcohol");
        }
    }

    public static void calculateGrade(int score) {
        if (score >= 90 && score <= 100) {
            System.out.println("Excellent");
        } else if (score >= 80 && score < 90) {
            System.out.println("Great");
        } else if (score >= 70 && score < 80) {
            System.out.println("Good");
        } else if (score >= 60 && score < 70) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

    }

    public static void maxNumber(double n1, double n2) {
        if (n1 > n2) {
            System.out.println(n1 + " is maximum number");
        } else if (n2 > n1) {
            System.out.println(n2 + " is maximum number");
        } else {
            System.out.println("Numbers are equal");
        }
    }

    public static void initial (String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println("initial is: " + initial);
        //(my way) String initial = firstName.substring(0, 1).toUpperCase() + lastName.substring(01).toUpperCase();

    }




}
