package com.example.android.javajoker;

import java.util.Random;

public class JokeSmith {
    private static String[] mJokes ={
            "A programmer puts two glasses on his bedside table before going to sleep. A full one, in case he gets thirsty, and an empty one, in case he doesnt.",
            "Why do programmers confuse halloween and christmas? Because Oct 31 = Dec 25",
            "There are only 10 kinds of people in this world: those who know binary and those who dont.",
            "All programmers are playwrights, and all computers are lousy actors.",
            "Q. How did the programmer die in the shower?\n" +
                    "A. He read the shampoo bottle instructions: Lather. Rinse. Repeat."
    };

    public String getJoke(){
        Random rand = new Random();
        return mJokes[rand.nextInt(mJokes.length)];
    }
}
