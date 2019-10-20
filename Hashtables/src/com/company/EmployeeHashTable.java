package com.company;

public class EmployeeHashTable {
    private StoredEmployee[] emplyeeTable;

    public EmployeeHashTable(){
        emplyeeTable = new StoredEmployee[10];
    }

    public void put(Employee employee, String value){
        int hashedValue = hashCode(value);
        if(occupied(hashedValue)) {
            //do linear probing
            //set a stop index..because we need to know where we started looking for empty spot
            int stopIndex = hashedValue;
            if (hashedValue == emplyeeTable.length - 1) {
                hashedValue = 0; //wrapping the hash valued to 0, when we hit the end of the array
            } else {
                hashedValue++;
            }

            while (occupied(hashedValue) && hashedValue != stopIndex) {
                hashedValue = (hashedValue + 1) % emplyeeTable.length;
            }
        }
        if(occupied(hashedValue)){
            System.out.println("Value already present");
        } else {
            emplyeeTable[hashedValue] = new StoredEmployee(value, employee);
        }
    }

    public Employee get(String value){
        int hashedValue = findKey(value);
        if(hashedValue == -1){
            return null;
        }
        return emplyeeTable[hashedValue].employee;
    }

    private int findKey(String key){
        int hashedKey = hashCode(key);
        if(emplyeeTable[hashedKey] != null && emplyeeTable[hashedKey].key.equals(key)){
            return hashedKey;
        }


            //do linear probing
            //set a stop index..because we need to know where we started looking for empty spot
        int stopIndex = hashedKey;
        if (hashedKey == emplyeeTable.length - 1) {
            hashedKey = 0; //wrapping the hash valued to 0, when we hit the end of the array
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex && emplyeeTable[hashedKey]!= null && !emplyeeTable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % emplyeeTable.length;
        }

        if(stopIndex == hashedKey){
            return -1;
        } else{
            return hashedKey;
        }
    }
    private boolean occupied(int index){
        return emplyeeTable[index] != null;
    }

    public void Print(){
        for(int i = 0; i < emplyeeTable.length; i++){
            if(emplyeeTable[i] == null){
                System.out.println("Empty");
            } else{
                System.out.println("Position " +i+ ": " +emplyeeTable[i].employee);
            }

        }
    }

    private int hashCode(String value){
        return value.length() % emplyeeTable.length;
    }
}
