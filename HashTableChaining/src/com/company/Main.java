package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee akash = new Employee("Akash", "Bangera", 100);
        Employee sujay = new Employee("Sujay", "Joshi", 200);
        Employee shalabh = new Employee("Shalabh", "Mittal", 300);
        Employee harshita = new Employee("Harshita", "Dekate", 400);

        ChainedHashtable s = new ChainedHashtable();

        s.put("Sujay", sujay);
        s.put("Shalabh", shalabh);
        s.put("Harshita", harshita);
        s.put("Akash", akash);

        s.PrintHashtable();
//        System.out.println(s.get("Shalabh"));
//
//        s.remove("Shalabh");
//        s.remove("Akash");
//        s.PrintHashtable();
    }
}
