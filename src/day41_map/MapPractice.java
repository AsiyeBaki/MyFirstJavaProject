package day41_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<String,Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender",'M');
        person1.put("age", 32);
        person1.put("Job_title","Developer");
        person1.put("salary",100000.5);
        person1.put("married", true);
        System.out.println("person1.get(\"name\") = " + person1.get("name"));
        System.out.println("person1.get(\"salary\") = " + person1.get("salary"));
        System.out.println("person1.get(0) = " + person1.get(0));  // null

        System.out.println("person1 = " + person1);


    }
}
