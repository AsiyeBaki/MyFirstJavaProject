package shorts;

public class String_substring {
    public static void main(String[] args) {

        String sentence = "I love Java programming language";
        // index numbers:  012345678910 11 ...

        String word1 = sentence.substring(7, 10+1); // it looks from first number to last number, does NOT include the last number
        System.out.println(word1);

        String word2 = sentence.substring(7);
        System.out.println(word2);






    }
}
