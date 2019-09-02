package exercise9;

public class exercise9 {

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(567898476));
    }

    public static int sumDigitsInNumber (int number) {

        int result = 0;
        while (number != 0) {
            result += number % 10;
            number = number / 10;
        }

        return result;
    }
}
