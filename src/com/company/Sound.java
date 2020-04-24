package com.company;

public class Sound {

    /**
     * the array of values in this sound; guaranteed not to be null
     */
    private int[] samples;

    /**
     * constructor created for testing purposes
     * Not part of original problem
     */
    public Sound(int[] samples) {
        this.samples = samples;
    }

    /**
     * Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -limit are changed to -limit.
     *
     * @param limit the amplitude limit
     *              Precondition limit >= 0
     * @return the number of values in this sound that this method changed.
     */
    public int limitAmplitude(int limit) {
        int count = 0;
        for (int i = 0; i <= samples.length - 1; i++) {
            if (samples[i] > limit) {
                samples[i] = limit;
                count++;
            } else if (samples[i] < (limit * -1)) {
                limit *= -1;
                samples[i] = limit;
                limit = Math.abs(limit);
                count++;
            }
        }
        return count;
    }

    /**
     * Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0;
     * Precodition: samples contains at least one nonzero value
     * Postcondition: the length of samples reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning() {

        if (samples[0] == 0) {
            int count = 0;
            for (int x : samples) {
                if (x != 0)
                    break;
                else
                    count++;
            }
            int[] arr = new int[samples.length - count];
            for (int x = 0; x < arr.length; x++) {

                arr[x] = samples[count];
                count++;
                if(samples.length == count)
                    break;
            }


            samples = arr;

        }
    }
        /** accessor method used for testing purposes - Not part of original program */
        public int[] getSamples () {
            return samples;
        }
    }

