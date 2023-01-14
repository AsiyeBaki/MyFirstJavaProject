package day27_accessModifier;

public class Car {    // outter class

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine { // it is co related with Car class/ Car engine is an Inner class
        // since this is not static that means it belongs to a class, Car

     public void method(){
         System.out.println(make);
         System.out.println(wheels);
     }
    }

    public static class StaticInnerClass {
        public void method(){
           // System.out.println(make);// since this inner class is static, it accepts statics  thats why "make" gives an error when you try to print it but "wheels" prints out since it is static
            System.out.println(wheels);
        }
    }



}
