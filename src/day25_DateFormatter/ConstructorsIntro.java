package day25_DateFormatter;

public class ConstructorsIntro {

    // what is the advantage of creating a constructor? you can determine how to object be created


    public ConstructorsIntro(String name, String lastName){
        System.out.println("Object is created by using String arguments constructor");
    }
    public ConstructorsIntro() {
        System.out.println("Object is created by using no argument constructor");
    }

    public ConstructorsIntro(int a) {
        System.out.println("Object is created by using int argument constructor");
    }

    public void add() {

    }


    public static void main(String[] args) {

        ConstructorsIntro obj1 = new ConstructorsIntro(10);
        ConstructorsIntro obj2 = new ConstructorsIntro(10);
        ConstructorsIntro obj3 = new ConstructorsIntro(10);
        ConstructorsIntro obj4 = new ConstructorsIntro();
        ConstructorsIntro obj5 = new ConstructorsIntro("Asiye","Baki");



    }

}
