package com.company;

public class SpinnerGame {
    /** Precondition: min < max
     * Simulates a spin of a spinner by returning a random integer
     * between min and max, inclusive.
     */
    public int spin(int min, int max)
    {

        int result = (int)(Math.random() * max) + min;
        return result;

    }

    /** Simulates one round of the game as described in part (b).
     */
    public void playRound() {

        int points = 0;
        int player = spin(1,10);
        int computer = spin(2,8);



       if(computer>player ) {
           points = player - computer;
           System.out.println("You lose. " + points + " points.");
       }
       else if (computer<player) {
           points = player - computer;
           System.out.println("You win! " + points + " points.");
       }

     else if (computer==player) {
            System.out.println("Tie. " + 0 + " points.");
            player += spin(1,10);
            computer += spin(2,8);
           if(computer>player ) {
               points = -1;
               System.out.println("You lose. " + points + " points.");
           }
           else if (computer<player) {
               points = 1;
               System.out.println("You win! " + points + " points.");
           }
        }




    }


}
