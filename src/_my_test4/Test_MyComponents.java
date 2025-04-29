package _my_test4;

import javax.swing.*;

public class Test_MyComponents extends JFrame {

    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JPasswordField passwordField;
    private JCheckBox checkBox;

    public Test_MyComponents() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("컴포넌트 확인");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button = new JButton("button");
        label = new JLabel("글자를 띄우는 컴포넌트");
        textField = new JTextField("아이디를 입력하세요");
    }

    private void setInitLayout() {
    }
}
