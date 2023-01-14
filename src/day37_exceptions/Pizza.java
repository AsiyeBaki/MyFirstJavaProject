package day37_exceptions;

import java.util.Arrays;

public class Pizza {

    private char size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calculateCost() {
        double totalPrice = 0.0;
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

    @Override
    public String toString() {
            return "Pizza{" +
                    "size=" + size +
                    ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                    ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                    ", total price= " + calculateCost() +
                    '}';

    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pizza)) {  // if the specified object is not pizza
            System.err.println("Invalid Object!" + obj);
            System.exit(1);
        }

        Pizza pizza = ((Pizza) obj); // to not repeat in the code for reuse purpose , we assign it back to a variable

        if (size == pizza.getSize()) {
            if (numberOfPepperoniTopping == pizza.getNumberOfPepperoniTopping()) {
                return true;
            }
        }
        return false;
    }



}
/*
1. Create a class named Pizza
			variables:
				size (char), numberOfCheeseTopping, numberOfPepperoniTopping

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				calcCost(): returns the total cost of the pizza

			Override toString method to print Pizza object info when the object is passed in the print statement

			Override equals method that returns true if the pizza object is equal to the specified pizza object


 */
