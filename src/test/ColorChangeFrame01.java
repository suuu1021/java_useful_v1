package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame01 extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;

    private JPanel panel1;
    private JPanel panel2;

    public ColorChangeFrame01() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel2 = new JPanel();
        button1 = new JButton("빨강");
        button2 = new JButton("주황");
        button3 = new JButton("노랑");
        button4 = new JButton("초록");
        button5 = new JButton("파랑");
        button6 = new JButton("보라");
    }

    private void setInitLayout() {
        setLayout(new GridLayout(2, 1));

        panel2.setBackground(Color.WHITE);
        add(panel1);
        add(panel2);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);

        setVisible(true);
    }

    private void addEventListener() {
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        System.out.println(jButton.getText());

        if (jButton == button1) {
            panel2.setBackground(Color.RED);
        } else if (jButton == button2) {
            panel2.setBackground(Color.ORANGE);
        } else if (jButton == button3) {
            panel2.setBackground(Color.YELLOW);
        } else if (jButton == button4) {
            panel2.setBackground(Color.GREEN);
        } else if (jButton == button5) {
            panel2.setBackground(Color.BLUE);
        } else {
            panel2.setBackground(new Color(100, 0, 255));
        }
    }

    public static void main(String[] args) {
        new ColorChangeFrame01();
    }
}
