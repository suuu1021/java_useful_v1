package test;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {

    private MyPanel myPanel;

    public MyPaintFrame() {
        initData();
        setInitData();
    }

    private void initData() {
        setTitle("HOME");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myPanel = new MyPanel();
    }

    private void setInitData() {
        add(myPanel);
    }

    static class MyPanel extends JPanel {

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            // 집
            g.drawRect(200, 200, 200, 200);
            // 지붕
            g.drawLine(300, 100, 200, 200);
            g.drawLine(300, 100, 400, 200);
            // 창문
            g.drawRect(230, 250, 50, 50);
            g.drawLine(255, 250, 255, 300);
            g.drawLine(230, 275, 280, 275);
            // 문
            g.drawRect(300, 300, 70, 100);
            g.drawRoundRect(310, 350, 10, 10, 30, 30);
            // 별
            g.drawString("★                  ★", 100, 100);
            g.drawString("★                  ★", 140, 80);
            g.drawString("★  ★  ★  ★  ★", 490, 260);
            // 땅
            g.drawLine(0, 400, 800, 400);
            // 눈사람
            g.drawRoundRect(500, 335, 65, 65, 65, 65);
            g.drawRoundRect(510, 285, 50, 50, 50, 50);
            g.drawString("^ _ ^", 520, 315);
            g.drawLine(480, 335, 505, 350);
            g.drawLine(560, 350, 585, 335);
        }
    } // ene of static inner class

    public static void main(String[] args) {
        new MyPaintFrame();
    }
}
