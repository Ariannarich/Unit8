package com.company;

public class Combinatorics {

    /** Precondition: n is between 1 and 12, inclusive.
     * Returns the factorial of n, as described in part (a). */
    public static int factorial(int n) { /* to be implemented in part (a) */
        int sum = 1;
        if (n == 1)
            return 1;

        else

        for(int x = 1; x<=n; x++)
{
    sum*=x;
}

        return sum;
    }


        /** Precondition: n and r are between 1 and 12, inclusive. * Determines the number of ways r items can be selected
         * from n choices and prints the result, as described in part
         (b). */
        public static void numCombinations ( int n, int r)
        { /* to be implemented in part (b) */
            int combinations = 0;
            if (r > n)
                System.out.println("There are " + combinations + " ways of choosing " + r + " items from " + n + " choices.");

            else if (r < n)
                combinations = (factorial(n)) / (factorial(r) * (factorial(n) - factorial(r)));
            System.out.println("There are " + combinations + " ways of choosing " + r + " items from " + n + " choices.");
        }
    }
