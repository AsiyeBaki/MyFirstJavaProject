package day25_DateFormatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeIntro {
    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);

        LocalDateTime ends = LocalDateTime.of(2023,5,18,11,0);
        System.out.println(ends);

        System.out.println(starts.getDayOfWeek());

        System.out.println(starts.getHour());
        System.out.println("-----------------------------------------");

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, MM/dd/y");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate birthday = LocalDate.of(1991,10,17);
        System.out.println(birthday);
        System.out.println(birthday.format(df));

        System.out.println("----------forTimes--------");

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time1 = LocalTime.of(17,30);
        System.out.println("time1 = " + time1.format(tf));

        System.out.println("----------------------");

       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MM/dd/y  hh:mm a"); // only date and time
       LocalDateTime starts2 = LocalDateTime.now();
       System.out.println("Date & Time: " + starts2.format(dtf));

       System.out.println("-----------------------------------------------");

       // Tuesday, 1:00 pm, Nov/24/2020

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/d/y");
        LocalDateTime myTime = LocalDateTime.of(2020,11,24,13,0);
        System.out.println(myTime.format(dtf2));


    }
}
