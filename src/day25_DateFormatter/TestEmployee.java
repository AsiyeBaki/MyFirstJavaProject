package day25_DateFormatter;

import java.time.LocalDate;

public class TestEmployee {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Asiye", 31,'F',"SDET", 100000, LocalDate.of(2020,10,10));
        System.out.println(emp1);


        Employee emp2 = new Employee("Nuri", 29,'M',"SDET",150000, LocalDate.of(2019,2,2));
        System.out.println(emp2);




    }
}
