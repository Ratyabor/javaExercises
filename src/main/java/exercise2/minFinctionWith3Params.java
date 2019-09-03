package exercise2;

public class minFinctionWith3Params {

    public static int min(int a, int b, int c) {
        int result = 0;

        if (a > b) {
            result = b;
        }  if (c < b) {
            result = c;
        }  if (a < c) {
            result = a;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
