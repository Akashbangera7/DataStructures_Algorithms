package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
         int[] intArray = {20,35,-15,7,55,1,-22};
         Insertion( intArray, intArray.length );
//                for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++)
//                {
//                    int newElement = intArray[firstUnsortedIndex];
//                    int i;
//                    for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--)
//                    {
//                      intArray[i] = intArray[i-1];
//                    }
//                    intArray[i] = newElement;
//                }

                for(int i = 0; i < intArray.length; i++)
                {
                    System.out.println( intArray[i] );
                }

            }

            public static void Insertion(int[] input, int numItems)
            {
                if(numItems < 2)
                {
                    return;
                }
                Insertion( input, numItems - 1  );
                int newElement = input[numItems - 1];
                int i;
                for(i = numItems - 1; i > 0 && input[i - 1] > newElement; i--)
                {
                    input[i] = input[i-1];
                }
                input[i] = newElement;
            }

}