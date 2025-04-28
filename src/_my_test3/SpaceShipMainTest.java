package _my_test3;

public class SpaceShipMainTest {

    public static void main(String[] args) {

        SpaceShip s1 = new SpaceShip();
        s1.startSpaceShip();

        SpaceShip.Engine e1 = new SpaceShip.Engine();
        SpaceShip.Engine e2 = new SpaceShip.Engine();

        s1.addEngine(e1);
        System.out.println("e1 엔진 장착");
        s1.startSpaceShip();

    }
}
