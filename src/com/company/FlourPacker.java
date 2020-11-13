package com.company;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int bigBag=bigCount*5;
        if(goal<0 || bigBag+smallCount<goal){
            return false;
        }
        else if(bigBag+smallCount==goal){
            return true;
        }
        else{
            int rem=goal/5;
            if((rem*5==goal && rem<=bigCount) || (
                    goal-rem*5<=smallCount && goal-rem*5>0)){
                return true;
            }
            return false;
        }
    }
}
