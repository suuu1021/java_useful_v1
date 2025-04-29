package _my_test4;

import javax.swing.*;
import java.awt.*;

public class Test_BorderLayout extends JFrame {

    JButton[] buttons;
    String[] directions = {BorderLayout.WEST, BorderLayout.EAST,
            BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH};

    public Test_BorderLayout() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("borderLayout 연습");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        buttons = new JButton[5];
        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("button" + (i + 1));
        }
    }

    private void setInitLayout() {
        setLayout(new BorderLayout(30,30));
        for (int i = 0; i < 5; i++) {
            add(buttons[i], directions[i]);
        }
    }

    public static void main(String[] args) {
        new Test_BorderLayout();
    }

}
