package ExtraTopics;

import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {

        Predicate<Integer> isOdd = a -> {
            if(a %2!=0){
                return true;
            } else {
                return false;
            }
        };

        boolean r1 = isOdd.test(21);
        System.out.println(r1);

        Predicate<String> isPalindrome = (a) -> {
          String reverse = "";
            for (int i = a.length()-1; i >=0 ; i--) {
                reverse += a.charAt(i);
            }
            return a.equalsIgnoreCase(reverse);
        };

        boolean r2 = isPalindrome.test("Wooden Spoon");
        System.out.println(r2);
    }
}
