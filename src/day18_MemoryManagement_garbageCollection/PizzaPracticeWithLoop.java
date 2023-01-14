package day18_MemoryManagement_garbageCollection;

public class PizzaPracticeWithLoop {
    public static void main(String[] args) {

        double total = 0;
        for (int i = 0; i < 20; i++) {
            Pizza small = new Pizza();
            small.setInfo('s', 2, 2);
            total += small.calculateCost();
            Pizza medium = new Pizza();
            medium.setInfo('m', 3, 4);
            total += medium.calculateCost();
            Pizza large = new Pizza();
            large.setInfo('l', 4, 5);
            total += large.calculateCost();

        }
        System.out.println("Your total for pizzas: " + total);


    }
}
