package com.company;

import javax.swing.plaf.synth.SynthUI;

public class SimpleHashTable {
    public StoredEmployee[] hashtable;

    public SimpleHashTable(){
        hashtable = new StoredEmployee[10];
    }

    //add an item to hashtable
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }
        if(hashtable[hashedKey] != null){
            System.out.println("There is already an employee at " +hashedKey);
        }
        hashtable[hashedKey] = new StoredEmployee(key, employee);
    }

    //retrieve an item from hashtable
    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }
        return hashtable[hashedKey].employee;

    }

    //remove an item
    public Employee remove(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }
        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        return employee;
    }

    //print the hashtable

    public void PrintHashTable(){
        for(int i=0; i<hashtable.length;i++){
            if(hashtable[i]==null){
                System.out.println("Empty");
            }
            else{
                System.out.println(hashtable[i].employee);
            }

        }
    }
    //hash function
    private int hashKey(String Key){
        return Key.length() % hashtable.length;
    }

    //check if the space is occupied..linear probing

    public boolean occupied(int index){
        return hashtable[index] != null;
    }

    public int findKey(String key){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length - 1){
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while(hashedKey != stopIndex && !hashtable[hashedKey].key.equals(key) && hashtable[hashedKey] != null){
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
            if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
                return hashedKey;
            }
            else {
                return -1;
            }

    }
}
