package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee Akash = new Employee( "Akash", "Bangera", 100 );
        Employee Harshita = new Employee( "Harshita", "Dekate", 200 );
        Employee Shalabh = new Employee( "Shalabh", "Mittal", 300 );
        Employee Sujay = new Employee( "Sujay", "Joshi", 400 );


        EmployeeLinkedList list = new EmployeeLinkedList();
        list.insertToHead( Akash );
        list.insertToHead( Harshita );
        list.insertToHead( Shalabh );
        list.insertToHead( Sujay );

        Employee tailEmp = new Employee( "TailEmp","End", 123 );

        list.insertToEnd( tailEmp );



        //print the list
        System.out.println(list.getSize());
        list.printList();
        list.removeFromFront();
        System.out.println("");
        System.out.println(list.getSize());
        list.printList();
        list.removeFromEnd();
        System.out.println("");
        System.out.println(list.getSize());
        list.printList();





    }
}
