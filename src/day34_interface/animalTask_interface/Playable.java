package day34_interface.animalTask_interface;

public interface Playable {

    // only static variables can be used in interface, and has to be given as final

    public static final boolean isFriendly = true;   // no need public static final


    // static & final has given as default , that's why is gray color
    // public has given as default , that's why is gray color

// How can you prove it is static ?
// main method is static can accept static variables, when we call it main method it does not give an error

// How to prove is final by default?
// you can not change the value, wll give an error when you try to put           public void method1 (){}\
/*
    private static void main(String[] args) {
        System.out.println(isFriendly);
        // isFriendly = false; // we can not reassign a value since it is final
    }  // Ex: of static method

    public default void method1() {  // you do not have to give the public since it is given bby default

    }

 */

    public abstract void play();  // public and abstract has given by default
}
