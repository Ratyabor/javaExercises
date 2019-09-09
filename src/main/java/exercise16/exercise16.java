package exercise16;

public class exercise16 {

    public static void main(String[] args) {

        boolean isFinished = true;

        while (isFinished) {
            for (int i = 0; i <= 9; i++) {
                for (int a = 0; a <=9; a++) {
                    System.out.print("S");
                    if (a == 9) {
                    System.out.println();
                }
                }
                if (i == 9) {
                    isFinished = false;
                }
            }
        }
    }
}
