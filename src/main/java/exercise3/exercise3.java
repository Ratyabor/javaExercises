package exercise3;

public class exercise3 {

    public static int min (int a, int b) {

        int result = 0;

        if (a < b) {
            result = a;
        } else {
            result = b;
        }

        return result;
    }

    public static int min (int a, int b, int c, int d) {

        int result = 0;

        if (min(a, b) > min(c, d)) {
            result = min(c, d);
        } else if (min(a, b) < min(c, d)) {
            result = min(a, b);
        }
        return result;
    }

//    public static int min (int a, int b, int c, int d) {
//
//        int result = a;
//
//        if (a > b) {
//            result = b;
//        } if (result > c) {
//            result = c;
//        } if (result > d) {
//            result = d;
//        }
//
//        return result;
//    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10,  -30, -40));
    }
}
