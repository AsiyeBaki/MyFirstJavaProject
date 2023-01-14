package shorts;

public class String_replaceFirst {
    public static void main(String[] args) {

        String sentence = "Python is cool, I Love Python Programming";

        sentence = sentence.replaceFirst("Python","Java"); //Java is cool, I Love Java Programming"

        System.out.println(sentence); // Java is cool. I Love Python Programming

        // it will be replacing only the first one.




    }
}
