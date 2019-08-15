package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee Akash = new Employee( "Akash", "Bangera", 100 );
        Employee Harshita = new Employee( "Harshita", "Dekate", 200 );
        Employee Shalabh = new Employee( "Shalabh", "Mittal", 300 );
        Employee Sujay = new Employee( "Sujay", "Joshi", 400 );

        EmployeeLinkedList emp = new EmployeeLinkedList();
        emp.addToFront(Akash);
        emp.addToFront(Harshita);
        emp.addToFront(Shalabh);
        emp.addToFront(Sujay);

        emp.printList();





    }
}
