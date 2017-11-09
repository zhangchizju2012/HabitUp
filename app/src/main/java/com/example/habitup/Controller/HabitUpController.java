package com.example.habitup.Controller;


import android.util.Log;

import com.example.habitup.Model.Habit;
import com.example.habitup.Model.UserAccount;

public class HabitUpController {

    static UserAccount currentUser;
    static Boolean setupDone = Boolean.FALSE;

    public HabitUpController() {

    }

    public void testAccount() {
        // DEBUG
        if (!HabitUpController.setupDone) {
            currentUser = new UserAccount("gojeffcho", "Jeff Cho", null);
            currentUser.getAttributes().setValue("Mental", 5);
            currentUser.getAttributes().setValue("Discipline", -10);
            currentUser.increaseXP(4);
            HabitUpController.setupDone = Boolean.TRUE;
        }
    }

    public int addHabit(Habit h) {
        currentUser.getHabits().add(h);
        Log.d("DEBUG", "Adding habit" + h.getHabitName());
        return 0;
    }

    static public UserAccount getCurrentUser() { return currentUser; }
    static public int getCurrentUID() { return currentUser.getUID(); }
}
