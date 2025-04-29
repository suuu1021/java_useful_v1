package _swing;

import javax.swing.*;

/**
 * 배치관리자 - 설정을 아무것도 안하면 또는 null 값으로 세팅을 하면
 * 좌표 기준으로 배치를 할 수 있다.
 */
public class NoLayoutEx01 extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;

    public NoLayoutEx01() {
        init();
        setInitLayout();
    }

    private void init() {
        setTitle("좌표값으로 버튼 배치하기");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
    }

    private void setInitLayout() {
        // 좌표값으로 배치(반드시 null 값을 입력하자)
        setLayout(null);

        // 좌표값을 선택하게 되면 먼저 컴포넌트의 사이즈를 결정해주어야 한다.
        // setter 메서드
        button1.setSize(100, 100);
        button2.setSize(100, 100);
        button3.setSize(100, 100);

        // 배치관리자가 좌표값이기 때문에 x, y 값을 지정해주어야 한다.
        button1.setLocation(0, 0);
        button2.setLocation(100, 0);
        button3.setLocation(200, 0);

        // 패널에 붙이기
        add(button1);
        add(button2);
        add(button3);

    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        new NoLayoutEx01();
    }

}
