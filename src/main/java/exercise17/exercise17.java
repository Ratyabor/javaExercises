package exercise17;

public class exercise17 {

    public static void main(String[] args) {
        int step = 1;
        int multiplier = 1;

        while (multiplier <= 10) {

            System.out.print(step * multiplier + " ");
            step++;

            if (step == 11) {
                multiplier++;
                step = 1;
                System.out.println();
            }
        }
    }
}
