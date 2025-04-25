package test;

public class Test_StringBuffer {

    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = new String("World");

        StringBuffer buffer1 = new StringBuffer(s1);
        System.out.println("수정전 : " + System.identityHashCode(buffer1));

        buffer1.append(s2);
        System.out.println("수정후 : " + System.identityHashCode(buffer1));

        System.out.println(buffer1.toString());

    }
}
