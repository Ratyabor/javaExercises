package exercise4;

public class exercise4 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++ ) {
            for (int move = 1; move <= 10; move++) {
                System.out.print(i * move + " ");
                if (move == 10) {
                    System.out.println();
                }
            }
        }
    }
}
