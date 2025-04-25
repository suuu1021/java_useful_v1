package test;

public class Test_ArrayExceptionHandling {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < 10; i++){
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        } catch (Exception e1){
            System.out.println(e1.getMessage());
            System.out.println(e1.getClass());
        }
        System.out.println("비정상 종료되지 않음");

    }
}
