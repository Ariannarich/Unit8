package com.company;

public class Hailstone {

    /**
     * Returns the length of a hailstone sequence that starts with n,
     * as described in part (a).
     * Precondition: n > 0
     */
    public static int hailstoneLength(int n) {
        /* to be implemented in part (a) */
        int length = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                length++;
            } else if (n % 2 != 0) {
                n = 3 * n + 1;
                length++;
            }
        }
        length++;

        return length;
    }

    /**
     * Returns true if the hailstone sequence that starts with n is considered long
     * and false otherwise, as described in part (b).
     * Precondition: n > 0
     */
    public static boolean isLongSeq(int n) {
        /* to be implemented in part (b) */

        if(n < hailstoneLength(n))
            return true;
        else
            return false;

    }


    /**
     * Returns the proportion of the first n hailstone sequences that are considered long,
     * as described in part (c).
     * Precondition: n > 0
     */
    public static double propLong(int n) {
        /* to be implemented in part (c) */
        double isLong=0;
        int k=1;

    while(k<=n)
    {
        int l = hailstoneLength(k);
        if(isLongSeq(k))
            isLong++;

            k++;

    }


        return isLong / n;

        // There may be instance variables, constructors, and methods not shown.
    }
}