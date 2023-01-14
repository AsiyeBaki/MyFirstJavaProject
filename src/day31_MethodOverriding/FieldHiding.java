package day31_MethodOverriding;


class A{
    public int a = 100;
}


public class FieldHiding {
    public int a = 300;// this is  field hiding

    public static void main(String[] args) {
        System.out.println(new FieldHiding().a); // 300 will be printed
    }
}

// whenever there is a same variables in both parent and child class, parent will hide the value
