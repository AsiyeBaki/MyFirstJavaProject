package day41_map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();       // implements Map, order is random , accepts null as key and as value

        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Daniel", 80000); // it will keep the last value that assigned
        hashMap.put("Aaron",78000);
        hashMap.put("Chris", null);
        hashMap.put("Brianna", null);
        hashMap.put(null,120000);
        hashMap.put(null,110000);
        hashMap.put(null,130000); // if there is more than one null, last one will be assigned
        System.out.println("hashMap = " + hashMap);
        System.out.println("--------------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // child class of HashMap, keep the insertion order, accepts null value as a key
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Daniel", 80000); // it will keep the last value that assigned
        linkedHashMap.put("Aaron",78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Brianna", null);
        linkedHashMap.put(null,120000);
        linkedHashMap.put(null,110000);
        linkedHashMap.put(null,130000); // if there is more than one null, last one will be assigned
        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("-----------------------------------------");
        Map<String, Integer> treeMap = new TreeMap<>();       // implements SortedMap, ascending order, does not accept null as key
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Daniel", 80000); // it will keep the last value that assigned
        treeMap.put("Aaron",78000);
        treeMap.put("Chris", null);
        treeMap.put("Brianna", null);
       // treeMap.put(null,120000);
       // treeMap.put(null,110000);
       // treeMap.put(null,130000); // if there is more than one null, last one will be assigned
        System.out.println("treeMap = " + treeMap); // will sort the keys

        System.out.println("---------------------------------------");

        Map<String, Integer> hashTable = new Hashtable<>();     // implements Map, random order, Does NOT accept null as key , neither as value, Synchronized(Thread-Safe)

        hashTable.put("Daniel", 95000);
        hashTable.put("Emily", 100000);
        hashTable.put("Bella", 85000);
        hashTable.put("Daniel", 80000); // it will keep the last value that assigned
        hashTable.put("Aaron",78000);
        // hasTable.put("Chris", null);   // value can not be null, NullPointerException will occur
        // hasTable.put("Brianna", null); // value can not be null, NullPointerException will occur
       // hashTable.put(null,120000);     // value can not be null, NullPointerException will occur

        System.out.println("hashTable = " + hashTable);
        try{
            hashTable.put(null,120000);
        } catch (RuntimeException e){
            e.printStackTrace();
        }


    }



    // Map<String,Integer> map = new LinkedList<>(); // Map only can be reference to map classes


}
