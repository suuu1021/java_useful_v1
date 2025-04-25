package test;

public class Test_String {

    public static void main(String[] args) {
        String s1 = "문자열1";

        String s2 = new String("a");
        String s3 = new String("a");

        System.out.println(s2 == s3);

        String s4 = "abc";
        String s5 = "abc";

        System.out.println(s4 == s5);

        String s6 = s4 + "def";
        System.out.println(s6);

        System.out.println("-----------------------");

        System.out.println(s2);
        System.out.println(System.identityHashCode(s2));
        s2 = s2.concat(s3);
        System.out.println(s2);
        System.out.println(System.identityHashCode(s2));

        System.out.println("-----------------------");

        String abc = "ABC";
        int countAbc = abc.length();
        System.out.println(countAbc);
        String Dbc = abc.replace("A", "D");
        System.out.println(Dbc);

        String result = abc.substring(0, 2);
        System.out.println(result);

    }
}
