package exercise1;

public class MinFunction {

    public static int min(int a, int b) {
        int result = 0;

        result = Integer.min(a, b);

        return result;
    }

    public static void main(String[] args) throws Exception {

        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }

}
