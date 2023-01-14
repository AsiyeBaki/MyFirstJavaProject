package day42_maps;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String , Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", "M");
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2022,1,13));
        person1.put("married", true);

        Map<String , Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", "F");
        person2.put("age", 36);
        person2.put("job_title", "Back-end-Developer");
        person2.put("salary", 90000);
        person2.put("hired_date", LocalDate.of(2021,8,8));
        person2.put("married", false);

        Map<String , Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Nora");
        person3.put("gender", "F");
        person3.put("age", 36);
        person3.put("job_title", "Back-end-Developer");
        person3.put("salary", 80000);
        person3.put("hired_date", LocalDate.of(2024,8,5));
        person3.put("married", true);

        Map<String , Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Asiye");
        person4.put("gender", "M");
        person4.put("age", 31);
        person4.put("job_title", "Back-end-Developer");
        person4.put("salary", 140000);
        person4.put("hired_date", LocalDate.of(2022,4,23));
        person4.put("married", true);

        Map<String , Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Nuri");
        person5.put("gender", "Other");
        person5.put("age", 28);
        person5.put("job_title", "Front and Back-end-Developer");
        person5.put("salary", 90000);
        person5.put("hired_date", LocalDate.of(2022,8,21));
        person5.put("married", true);


        List<Map<String, Object>> listOfMaps = new ArrayList<>(); // list of maps

        listOfMaps.add(person1);
        listOfMaps.add(person2);
        listOfMaps.addAll(Arrays.asList(person3,person4,person5));

        System.out.println("listOfMaps = " + listOfMaps);
        System.out.println("----------------------------------------------------------");

        for (Map<String ,Object> eachMap : listOfMaps){
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()){
                System.out.println(eachEntry);
            }
        }
        System.out.println("-------display the names of the employee who are hired this year (2022)-------------------------------------");

        for (Map<String, Object> eachMap : listOfMaps){
          for (Map.Entry<String,Object> eachEntry : eachMap.entrySet() ){
              if (eachEntry.getKey().equals("hired_date")){
                  if( ( (LocalDate)eachEntry.getValue() ).getYear() == 2022 )  {
                   //   System.out.println(eachEntry); // for hired_date
                      //System.out.println("eachMap = " + eachMap);  //  for full info of the employees who has hired in 2022
                      System.out.println(eachMap.get("name") + "'s " + eachEntry);
                  }
              }
          }
        }

        System.out.println("---------------------------------------------------------");









    }
}
