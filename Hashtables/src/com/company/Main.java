package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee akash = new Employee("Akash","Bangera", 100);
        Employee sujay = new Employee("Sujay","Joshi", 200);
        Employee shalabh = new Employee("Shalabh","Mittal", 300);

        Employee harshita = new Employee("Hrashita","Dekate", 400);

        EmployeeHashTable e = new EmployeeHashTable();
        e.put(akash,"Akash");
        e.put(sujay,"Sujay");
        e.put(shalabh,"Shalabh");
        e.put(harshita,"Hrashita");

        e.Print();

        System.out.println(e.get("Akash"));





    }
}
