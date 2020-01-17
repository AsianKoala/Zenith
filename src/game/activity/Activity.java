package game.activity;


import game.components.handlers.Level;
import game.controls.Input;
import util.Clock;

import javax.swing.*;


import static game.components.handlers.Level.*;

public class Activity {

    private Layout layout = new Layout();

    public states ourStates = states.MENU;
    private enum states {
        MENU,
        LEVEL_SELECT,
        SETTINGS,
        GAME,
    }


    private int currLevelIndex = 0;



    public void nextLevel() {
        if (currLevelIndex == getLevels().size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        currLevelIndex ++;
    }

    public void setLevel(int index) { currLevelIndex = index; }
    public int getCurrLevelIndex() { return currLevelIndex; }






    public void init(JPanel panel) {
        setLevel(0);
        Input.init(panel); // listeners



        for(Level l : getLevels()) {
            l.initLevel();
        }

        clock.startClock();
    }



    Clock clock = new Clock(5000);

    public void run() {
        switch (ourStates) {

            case MENU:

        }
    }
}