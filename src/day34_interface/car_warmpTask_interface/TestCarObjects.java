package day34_interface.car_warmpTask_interface;

public class TestCarObjects {
    public static void main(String[] args) {
      // Car car1 = new Car(); //  error   -- you can not create objects from Parent class, it has to be concrete class/ sub class

        Honda honda = new Honda( "Civic", "Black", 2005, 25000);
        Audi audi = new Audi("Q6","Silver", 2020,36000);
        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 6000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("------ stop method--------");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("----- start method -----");
        honda.start();
        audi.start();
        tesla.start();
        System.out.println(" ---  autoPark --- autoPilot ----");
        audi.autoPark();
        tesla.autoPilot();

    }

}
