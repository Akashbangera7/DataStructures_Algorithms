package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = {20,35,-15,7,55,1,-22};
        MergeSort( intArray, 0, intArray.length );


        System.out.println( "Sorted Array: " );
        for(int i = 0; i < intArray.length; i++)
        {

            System.out.println( ""+intArray[i]  );
        }
    }

    public static void MergeSort(int[] input, int start, int end)
    {
        if(end - start < 2)
        {
            return;
        }

        int mid = (start + end) / 2;
        MergeSort( input, start, mid ); //left array
        MergeSort( input, mid, end );
        Merge( input, start, mid, end );

    }


    public static void Merge(int[] input, int start, int mid, int end)
    {
        if(input[mid - 1] < input[mid])
        {
            return;
        }
        int i = start;
        int j = mid;
        int[] tempArray = new int[end - start];
        int tempIndex = 0;
        while(i < mid && j < end)
        {
            tempArray[tempIndex++] = (input[i] <= input[j]) ? input[i++]: input[j++];
        }
        System.arraycopy( input, i, input, start+tempIndex, mid - i );
        System.arraycopy( tempArray, 0, input, start, tempIndex );
    }

}
