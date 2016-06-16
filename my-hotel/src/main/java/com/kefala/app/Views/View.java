package com.kefala.app.Views;

import java.util.ArrayList;

/**
 * Created by kefala on 15/06/16.
 */
public class View {
    public static void showMsg (String msg) {
        System.out.printf(msg);
    }

    public static void showTitle(String msg) {
        View.showMsg("----------------------------------------------------------\n");
        View.showMsg(msg + "\n");
        View.showMsg("----------------------------------------------------------\n");
    }

    public static void showOptionMenu(ArrayList<String> options) {
        Integer index = 1;
        for (String option : options) {
            View.showMsg(index.toString());
            View.showMsg(". ");
            View.showMsg(option);
            View.showMsg("\n");
            index++;
        }
    }
}
