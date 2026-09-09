package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

public class LazyTeenager {

    public static void main(String[] args) {

        int times = 0;
        int chance = 0;
        // We can either generate the random chance checker before the loop (fixed) or after (varies)
        // Doing it before is easier so we will do this method for now
        Random rng = new Random();
        int check = rng.nextInt(101);

        do {
            System.out.print("Clean your room!! ");
            if (times == 7) {
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            }
            times++;
            System.out.println("(x" + times + ")");
            chance+= 10;
        } while (chance < check);

        if (chance > check) System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
    }
}
