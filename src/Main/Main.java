/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import javax.swing.JApplet;
import javax.swing.JFrame;

/**
 *
 * @author naree1878
 */
public class Main extends JApplet{

    Graphics2D myPic;
    Image dbImage, master;
    private Graphics dbg;

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(123, 123);
        f.setVisible(true);
        JApplet applet = new JApplet();
        applet = new Main();        //sets up the window
        f.getContentPane().add("Center", applet);
        applet.init();
        f.pack();
        f.setSize(123,123);
        Methods m = new Methods();
        Point p = new Point();
        p.setLocation(788, 455);
        m.rNum(1, 99); //input min and max, output random num between the two
        m.gridPos(p); //input mousePos, output grid position        
        m.wait(4); //input wait time(s)
        m.color(1); //input color number, outputs color
    }

    public void paint(Graphics g) {
        dbImage = createImage(getWidth(), getHeight());      //creats and image the size of the screen
        dbg = dbImage.getGraphics();        //double buffers the panel
        paintComponent(dbg);
        g.drawImage(dbImage, 0, 0, this);
    }

    public void paintComponent(Graphics g) {
        myPic = (Graphics2D) g;
        myPic.setColor();
        myPic.fillRect(12, 12, 12,12);
    }
}
