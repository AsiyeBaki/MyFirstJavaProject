package day25_DateFormatter;

import java.time.LocalDate;

public class TestPersonClass {
    public static void main(String[] args) {

        Person p1 = new Person("Necip", 34,'M', LocalDate.of(1993,1,1), true, true);
        Person p2 = new Person("Asiye", 31 , 'f', LocalDate.of(1963, 5,2),false, true);
        Person p3 = new Person("Tugba", 29 , 'f', LocalDate.of(1997, 6,3),true, true);
        Person p4 = new Person("Halit", 41 , 'f', LocalDate.of(1993, 8,4),false, true);
        Person p5 = new Person("Gulay", 21 , 'f', LocalDate.of(1983, 12,5),true, true);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        System.out.println(p1.eat("Pasta"));
        System.out.println(p2.drink("water"));
        System.out.println(p3.eat("cake"));
        p4.sleeping();
        p5.sleeping();


    }
}
