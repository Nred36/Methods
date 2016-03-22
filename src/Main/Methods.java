/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;

/**
 *
 * @author naree1878
 */
public class Methods {

    public int rNum(int min, int max) {
        int rnd = (int) Math.ceil(Math.random() * (max - min + 1) + (min - 1));
        return (rnd);
    }

    public int gridPos(int i) {
        int pos = (int) Math.floor(i / 30);
        return (pos);
    }

    public int wait(int t) {
        long i = System.currentTimeMillis();

        while ((System.currentTimeMillis() - i) / 1000 < t) {
        }
        return (1);
    }

    public Color color(int i) {
        Color c;
        if (i == 0) {
            c = new Color(0, 0, 0);
        } else if (i == 1) {
            c = new Color(0, 0, 0);
        } else if (i == 2) {
            c = new Color(0, 0, 0);
        } else if (i == 3) {
            c = new Color(0, 0, 0);
        } else if (i == 4) {
            c = new Color(0, 0, 0);
        } else if (i == 5) {
            c = new Color(0, 0, 0);
        } else if (i == 6) {
            c = new Color(0, 0, 0);
        } else {
            c = new Color(0, 0, 0);
        }

        return (c);
    }

}
