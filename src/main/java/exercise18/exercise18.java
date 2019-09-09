package exercise18;

public class exercise18 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i == 1) { // works without this "if", but not displays on the screen "1"
                System.out.println(i);
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
