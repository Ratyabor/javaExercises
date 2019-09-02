package exercise2;

public class minFinctionWith3Params {

    public static int min (int a, int b, int c) {
        int result = Integer.min(a, b);
        result = Integer.min(result, c);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(min(1,2,3));
        System.out.println(min(-1,-2,-3));
        System.out.println(min(3,5,3));
        System.out.println(min(5,5,10));
    }
}
