package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Employee akash = new Employee("Akash", "Bangera", 100);
        Employee sujay = new Employee("Sujay", "Joshi", 100);
        Employee shalabh = new Employee("shalabh", "mittal", 100);
        Employee harshita = new Employee("harshita", "dekate", 100);

        Map<String, Employee> hashMap = new HashMap<String, Employee>();
        hashMap.put("ak", akash);
        hashMap.put("su", sujay);
        hashMap.put("sh", shalabh);
        hashMap.put("ha", harshita);

        Employee emp = hashMap.putIfAbsent("ak", shalabh);
//        System.out.println(emp);

//        Iterator<Employee> iter = hashMap.values().iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

        //get
//        System.out.println(hashMap.get("aka"));
//        System.out.println(hashMap.getOrDefault("aka", akash));
//        System.out.println(hashMap.containsKey("ak"));
//        System.out.println(hashMap.containsValue(shalabh));

        //remove

        System.out.println(hashMap.remove("ak"));

        hashMap.forEach((k,v) -> System.out.println("Key = " + k + " Employee = "+v));

    }

}