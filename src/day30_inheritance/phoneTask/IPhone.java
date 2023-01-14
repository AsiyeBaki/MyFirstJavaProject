package day30_inheritance.phoneTask;


public class IPhone extends Phone {  // Iphone is a Phone

    // sub class:  if you define the feautres wil not be inherited from th ephone class and iphone class still needs it.
    // Ex:  facetime


    // only a constructor can call another constructor


    public IPhone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }


    public static boolean hasApplePay = true;


    public void faceTime(long phoneNumber){
        System.out.println(getModel() + " is facetiming with " + phoneNumber);
    }

    public void faceTime(String email){

        System.out.println(getModel() + " is facetiming with " + email);
    }
}
