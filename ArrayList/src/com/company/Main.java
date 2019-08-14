package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee( "Akash", "Bangera", 100 ));
        employeeList.add(new Employee( "Shalabh", "Mittal", 200 ));
        employeeList.add(new Employee( "Harshita", "Dekate", 300 ));
        employeeList.add(new Employee( "Sujay", "Joshi", 400 ));


        //print the list
//        employeeList.forEach( employee -> System.out.println( employee ) );

        //get the second employee
//        System.out.println( employeeList.get( 1 ) );

        //check if the list is empty

//        System.out.println( employeeList.isEmpty() );

        //replace akash bangera with adithya bangera
//        employeeList.set( 0, new Employee( "Adithya", "Bangera", 600 ) );
//        employeeList.forEach( employee -> System.out.println( employee ) );

        //get the number of items in the list

//       System.out.println( employeeList.size() );

        //add akash bangera after harshita

//        employeeList.add(3, new Employee( "Bhumika", "Bangera", 700 ));
//        employeeList.forEach( employee -> System.out.println( employee ) );

        //to get the backing array

//        Object[] employeeArray = employeeList.toArray();

        //to get the Employee array

//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for(Employee employee: employeeArray){
//            System.out.println( employee );
//        }

        //check if the list contains an instance of employee

//        System.out.println( employeeList.contains( new Employee( "Akash", "Bangera", 100) ) );

        //checking the index

//        System.out.println( employeeList.indexOf( new Employee( "Sujay", "Joshi", 400 ) ) );

        //remove the employee

        employeeList.remove( 2 );
        employeeList.forEach( employee -> System.out.println( employee ) );


    }
}
