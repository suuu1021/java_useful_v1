package _my_test3;

public class OuterClass {

    private int num = 10;

    class InnerClass {
        public void display(){
            System.out.println("inner class display() 호출" + num);
        }
    }

    public static void main(String[] args) {
        OuterClass o1 = new OuterClass();
        OuterClass.InnerClass i1 = o1.new InnerClass();
        i1.display();
    }

}
