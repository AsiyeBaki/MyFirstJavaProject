package shorts;

public class String_contains {
    public static void main(String[] args) {


        // with this method we are looking to sentence to see if "Java or anything " has contained in the sentence
        // this is CASE SENSETIVE as well
        String sentence = "I love Java and Python programming languages";

        boolean hasJava = sentence.contains("Java");
        System.out.println(hasJava);  // "Java" true
        boolean hasjava = sentence.contains("java");
        System.out.println(hasjava); // "java" false
        boolean hasPython = sentence.contains("phyton");
        System.out.println(hasPython); // "python" false  // first letter is upper case




    }
}
