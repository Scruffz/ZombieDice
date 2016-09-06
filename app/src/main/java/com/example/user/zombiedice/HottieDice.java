package com.example.user.zombiedice;

/**
 * Created by user on 06/09/2016.
 */
public class HottieDice extends Dice {

    @Override
    public String getType() {
        return "Hottie";
    }

    @Override
    public Side roll(){
        int roll = (int)(Math.random()*6);
        switch (roll){
            case 0:
                return Side.BRAIN;
            case 1:case 2:
                return Side.SHOTGUN;
            default:
                return Side.FOOTSTEP;
        }
    }


}
