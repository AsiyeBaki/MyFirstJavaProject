package ExtraTopics;

public class TestMyFunction {
    public static void main(String[] args) {

        System.out.println(" ---- cube -----");
        MyFunction<Integer> displayCube = (a) -> {
            System.out.println(a * a * a);
        };
        displayCube.function(3);


        System.out.println(" ---- oddOrEven ----");

        MyFunction oddOrEven = (a) -> {
            if (a % 2 == 0) {
                System.out.println(a + " is even number");
            } else {
                System.out.println(a + " is odd number");
            }
        };

        oddOrEven.function(21);

    }
}
