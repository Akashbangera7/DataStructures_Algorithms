package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable(){
        hashtable = new LinkedList[10];
        //storing each linkedlist in array
        for(int i = 0; i < hashtable.length; i++){
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while(iterator.hasNext()){
            employee = iterator.next();
            if(employee.key.equals(key)){
                return employee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key){
        int hashedKey = hashKey(key);
        int index = -1;
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while(iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.key.equals(key)) {
                break;
            }
        }

            if (employee == null || !employee.key.equals(key)) {
                return null;
            }
            else{
                hashtable[hashedKey].remove(index);
                return employee.employee;
            }
    }
    private int hashKey(String key){

        return Math.abs(key.hashCode() % hashtable.length);
    }

    public void PrintHashtable(){
        for(int i = 0 ; i < hashtable.length; i++){
            if(hashtable[i].isEmpty()){
                System.out.println("Position" + i + " is empty");
            }
            else {
                System.out.print("Position" + i + " : ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while(iterator.hasNext()){
                    System.out.print(iterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }
}
