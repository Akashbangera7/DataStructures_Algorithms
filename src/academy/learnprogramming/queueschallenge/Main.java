package academy.learnprogramming.queueschallenge;

//import java.util.LinkedList;

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
        LinkedList<String> stringArrayStack = new LinkedList<String>();
        LinkedList<String> stringArrayQueue = new LinkedList<String>();
        for (int i = 0; i < string.length(); i++) {
            char str = string.charAt(i);
            if (str > 'A' && str < 'Z' || str > 'a' && str < 'z') {
                stringArrayStack.push(String.valueOf(str));
            }
        }
        for (int i = 0; i < string.length(); i++) {
            char str = string.charAt(i);
            if (str > 'A' && str < 'Z' || str > 'a' && str < 'z') {
                stringArrayQueue.add(String.valueOf(str));
                if (!(stringArrayStack.pop()).equalsIgnoreCase(stringArrayQueue.poll())) {
                    return false;

                }
            }

        }return true;


    }
}
