package ExtraTopics;

@FunctionalInterface
public interface MyFunction<T> {

    void function(int n);








    public static void main(String[] args) {
        MyFunction<Integer> displayCube = (a) -> {
            System.out.println(a * a * a);
        };

        displayCube.function(10);
    }
}
