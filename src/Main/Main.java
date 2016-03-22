/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Point;
import java.awt.Color;

/**
 *
 * @author naree1878
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Methods m = new Methods();
        Point p = new Point();
        p.setLocation(788, 455);
        m.rNum(1, 99); //input min and max, output random num between the two
        m.gridPos(p); //input mousePos, output grid position        
        m.wait(4); //input wait time(s)
        m.color(1); //input color number, outputs color       
    }

}
