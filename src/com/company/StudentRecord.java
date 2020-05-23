package com.company;

public class StudentRecord {

    private int[] scores; // contains scores.length values. scores.length > 1

    public StudentRecord(int[] scores) {
        this.scores = scores;
    }

    /**
     * Returns the average (arithmetic mean) of the values in scores
     * whose subscripts are between first and last, inclusive
     * precondition: 0 <= first <= last < scores.length
     * Method is marked public for testing purposes.
     */
    public double average(int first, int last) {
        /* to be implemented in part (a) */
        double total = 0;
        if (scores[0] == first && scores[scores.length - 1] == last || first + last == scores.length - 1)

            for (int x = 0; x <= scores.length - 1; x++) {
                total += scores[x];
            }
        double avg = total / (scores.length);
        return avg;
    }

    /**
     * Returns true if each successive value in scores is greater
     * than or equal to the previous value;
     * otherwise, returns false
     * Method marked public for testing purposes.
     */
    public boolean hasImproved() {
        double max = 0;
        int count = 0;
        for (double k : scores) {
            if (max < k) {
                max = k;
                count++;
            }
        }
        if (count == scores.length)
            return true;
        else
            return false;
    }

    /**
     * If the values in scores have improved, returns the average of the elements in scores
     * with indexes greater than or equal to scores.length/2;
     * otherwise, returns the average of all the values in scores
     */
    public double finalAverage() {
        /* to be implemented in part (c) */
        double avg;
        double total = 0;
        int count = 0;
        if (hasImproved()) {
            for (double k : scores) {
                count++;
                if (count >= (scores.length / 2))
                    total += k;
            }
            avg = total / scores.length - 1;
        } else
            avg = average(scores[0], scores[scores.length - 1]);
        return avg;
    }
}
