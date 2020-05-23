package com.company;

import java.util.ArrayList;

public class RepairSchedule
{
    /** Each element represents a repair by an individual mechanic
     in a bay. */
    private ArrayList<CarRepair> schedule;

    /** Number of mechanics available in this schedule. */
    private int numberOfMechanics;


/** Constructs a RepairSchedule object.
 *  Precondition: n >= 0
 */
    public RepairSchedule(int n) {
        schedule = new ArrayList<CarRepair>();
        numberOfMechanics = n;
    }


/** Attempts to schedule a repair by a given mechanic in a
  * given bay as described in part (a).
  * Precondition: 0 <= m < numberOfMechanics and b >= 0
  */
    public boolean addRepair(int m, int b) {
        if (schedule.size() == 0) {
            schedule.add(new CarRepair(m, b));
            return true;
        } else {

            schedule.add(new CarRepair(m, b));

            int count =0;
             for (CarRepair k : schedule) {
                 count++;
                if (k.getBayNum() == b || k.getMechanicNum() == m) {
                    carOut(b);
                    return false;}
                else if(count == schedule.size()-1){
                    break;
                }
            }
             return true;
        }
    }


 /** Returns an ArrayList containing the mechanic identifiers of
  * all available mechanics,
  * as described in part (b).
  */
 public ArrayList<Integer> availableMechanics()
    {
           ArrayList<Integer> mech = new ArrayList<Integer>();


            if(mech.size()<numberOfMechanics){
                for(int x = schedule.get(schedule.size()-1).getMechanicNum()+1; x<numberOfMechanics; x++)
                {
                    mech.add(x);



            }
        }

        return mech;
 }


 /** Removes an element from schedule when a repair is complete
  * Only to be used by the driver
  */
    public void carOut(int b) {
        for (int i=schedule.size()-1; i>=0; i--) {
            if (schedule.get(i).getBayNum() == b) {
                schedule.remove(i);
            }
        }
    }
    
}

