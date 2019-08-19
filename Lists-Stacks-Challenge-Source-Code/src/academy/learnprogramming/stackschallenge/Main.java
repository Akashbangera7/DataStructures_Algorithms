package academy.learnprogramming.stackschallenge;

import javax.print.DocFlavor;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<String> stack = new LinkedList<String>();
        for(int i = 0; i < string.length(); i++){
            char str = string.charAt(i);
            if(str >= 'a' && str <= 'z' || str >= 'A' && str <= 'Z')
            {
                stack.push(String.valueOf(str));
            }
        }

        for(int i = 0; i < string.length(); i++)
        {
            char str = string.charAt(i);
            if(str >= 'a' && str <= 'z' || str >= 'A' && str <= 'Z')
            {
                if(!(String.valueOf(str).equalsIgnoreCase(stack.pop()))){
                    return false;
                }
            }

        }return true;
    }



}
