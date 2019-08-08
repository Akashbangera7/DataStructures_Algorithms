package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = {20,35,-15,7,55,1,-22};

        for(int unsortedPartitionElement = intArray.length - 1; unsortedPartitionElement > 0; unsortedPartitionElement--)
        {
            int largest = 0;
            for(int i = 1; i <= unsortedPartitionElement; i++)
            {
                if(intArray[i] > intArray[largest])
                {
                    largest = i;
                }
            }
            swap( intArray,largest, unsortedPartitionElement);
        }
        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] intArray, int i, int j)
    {
        if(i == j)
        {
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
