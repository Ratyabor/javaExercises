package exercise3;

public class exercise3 {

    public static int min (int a, int b) {

        int result = Integer.min(a, b);

        return result;
    }


    public static int min (int a, int b, int c, int d) {

        int result = Integer.min(min(a, b), min(c,d));

        return result;
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10,  -30, -40));
    }
}
