package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = {20,35,-15,7,55,1,-22};

        QuickSort( intArray, 0 ,intArray.length );

        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println( intArray[i] );
        }

    }

    public static void QuickSort(int[] input, int start, int end)
    {
        if( end - start < 2)
        {
            return;
        }

        int pivot = Partition(input, start, end);
        QuickSort(input, start, pivot);
        QuickSort( input, pivot + 1, end );
    }

    public static int Partition(int[] input, int start, int end)
    {
        int pivot = input[start];
        int i = start;
        int j = end;

        while(i < j)
        {
            while(i < j && input[--j] >= pivot);
            if(i < j)
            {
                input[i] = input[j];
            }

            while(i < j && input[++i] <= pivot);
            if(i < j)
            {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }

}
