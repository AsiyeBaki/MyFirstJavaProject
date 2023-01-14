package day41_map;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String,String> map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("D05", "Asiye");
        map.put("B78", "Nuri");
        map.put("A78", "Nuri");
        map.put("C78", "Nuri"); // value can be duplicated as long as key is unique

        System.out.println("map.size() = " + map.size());
        System.out.println("map = " + map);
        System.out.println("map.get(\"A04\") = " + map.get("A04"));

        map.put("A04", "Lucy");
        map.put("A06", "Madiyar");
        System.out.println("map = " + map);

        System.out.println(map.get("B03"));
        map.replace("C02", "Aseel"); // it looks for the value to change it, it faster than put() method

        System.out.println("map.remove(\"A05\") = " + map.remove("A05"));
        System.out.println("map = " + map);

        System.out.println(map.containsKey("B03")); // true

        System.out.println(map.containsValue("Madiyar")); // true
        System.out.println(map.containsValue("Cicik")); // false
        System.out.println(map.isEmpty()); // false
        System.out.println(map.equals(map)); // true

        map.clear();
        System.out.println(map);

    }
/*
pair: id - name
 */



}
