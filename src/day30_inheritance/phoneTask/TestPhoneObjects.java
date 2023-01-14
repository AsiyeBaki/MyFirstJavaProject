package day30_inheritance.phoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("Iphone 12", "Large", "Black", 1000.5);
        Samsung samsung = new Samsung("Galaxy S22", "Medium", "White", 1100);
        Nokia nokia = new Nokia("Brick", "Small", "Pink",50);

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(123456789);
        iphone.text(123456789);
        iphone.text(123456789);

        System.out.println("----------------------");

        iphone.faceTime(123456789);
      //   samsung.faceTime(123456789); // since it belongs ONLY child iphone class
      //  nokia.faceTime(123456789); //  since it belongs ONLY child iphone class

        samsung.freeze();
    //     nokia.free();
     //   iphone.free();

        nokia.selfDefense();

        System.out.println("-------------------");
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);









    }




}
