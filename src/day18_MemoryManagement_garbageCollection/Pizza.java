package day18_MemoryManagement_garbageCollection;

public class Pizza {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.size = 'M';
        pizza1.numberOfCheeseTopping = 1;
        pizza1.numberOfPepperoniTopping = 2;

        Pizza pizza2 = new Pizza();
        pizza2.setInfo('L', 2, 2);

        Pizza pizza3 = new Pizza();
        pizza3.setInfo('s', 1, 2);

        System.out.println(pizza1 + "\n" + pizza1.calculateCost());
        System.out.println(pizza2 + "\n" + pizza2.calculateCost());
        System.out.println(pizza3 + "\n" + pizza3.calculateCost());
    }

    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;


    public double calculateCost() {
        double totalPrice = 0;
        switch (size) {
            case 'S':
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            default:
                System.out.println("Invalid Size: " + size);
        }
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price= " + calculateCost() +
                '}';
    }

    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;

    }

}

