package com.company;


public class StringManip {
    /**
     * Takes a string str and returns a new string * with all spaces removed.
     */
    public static String removeSpaces(String str) {
        String noSpace = "";
        for (int i = 0; i < str.length(); i++) {
            if (!str.substring(i, i + 1).equals(" ")) {
                noSpace += str.substring(i, i + 1);
            }
        }
        return noSpace;
    }


    /**
     * Takes a string str and returns a new string
     * with the characters reversed, as described in part (a).
     */
    public static String reverseString(String str) { /* to be implemented in part (a) */
        String blank = "";
        for (int x = str.length() - 1; x >= 0; x--) {
            blank += str.charAt(x);

        }
        return blank;
    }


    /**
     * Determines whether str is a palindrome and prints a message
     * indicating the result, as described in part (b).
     * Precondition: str contains only lowercase letters and spaces.
     */
    public static void palindromeChecker(String str) { /* to be implemented in part (b) */

        String p = reverseString(str);
        p = removeSpaces(p);
        String str2= removeSpaces(str);
        boolean palindrome = false;
        int count = 0;
        int i = p.length() - 1;
        while (count<= i) {
            if(str2.charAt(count) == p.charAt(count))
                palindrome = true;
            else {
                palindrome = false;
                break;
            }

            count++;
        }
        if (palindrome)
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome.");

    }

    }
