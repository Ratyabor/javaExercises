package exercise10;

public class exercise10 {

    public static void main(String[] args) {

        exercise10.Cat cat1 = new exercise10.Cat();
        Cat.count++;
        exercise10.Cat cat2 = new exercise10.Cat();
        Cat.count++;

        System.out.println("Created classes: " + Cat.count++);

    }

    public static class Cat {
        public static int count = 0;
    }
}
