package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("-------------------------------------");
        // hot many female & male employees in the map?
        int countMaleEmployee = 0;
        int countFemaleEmployee = 0;

        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("F")) {
                countFemaleEmployee++;
            } else {
                countMaleEmployee++;
            }
        }

        System.out.println("Male Employees: " + countMaleEmployee);
        System.out.println("Female Employees: " + countFemaleEmployee);
/*
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployee++;
            } else {
                countFemaleEmployee++;
            }
        }

 */
        System.out.println("----------------------------------------");

        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if (gender.equals("F")) {
                System.out.println("Name of FEMALE employees: " + name);
            }  // displays the all names of FEMALE employees
        }

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("F")) {
                System.out.println("Female employees with names: " + eachEntry.getKey());
            }  // displays the all names of FEMALE employees
        }

        System.out.println("-----------------------------------------");
        // update all the "M" values with "Male" and "F" values to female

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("M")) {
                eachEntry.setValue("Male");
            } else {
                eachEntry.setValue("Female");
            }
           // System.out.println(eachEntry); //it wil print each entry as Winfred=Male
        }

        System.out.println(employeeMap);
    }
}
