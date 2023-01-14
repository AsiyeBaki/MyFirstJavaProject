package day08_ternary_switch;

public class Elevator {
    public static void main(String[] args) {

        int floor = 3;

        String result = "Invalid Floor";

        if (floor >= 1 && floor <= 3) {

            result = "Floor " + floor + " selected. Companies: ";

            if (floor == 1) {
                result += "Lobby, Verizon, Starbucks";
            } else if (floor == 2) {
                result += "Cydeo, NASA, Intelsat";
            } else {
                result += "Lyft, BofA, Steak House";
            }

        } else {
            result = "Invalid Floor";
        }

        System.out.println(result);


        /*

        int floor = 3;
        if (floor >= 1 && floor <= 3) {

            if (floor == 1) {
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            } else if (floor == 2) {
                System.out.println("Floor 2 selected. Companies: Cydeo, NASA, Intelsat");
            } else {
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Steak House");
            }

        } else {
            System.out.println("Invalid Floor");
        }

         */


    }
}
