package exercise5;

public class exercise5 {

    public static void main(String[] args) {

        exercise5.Red red = new exercise5.Red();
        exercise5.Orange orange = new exercise5.Orange();
        exercise5.Yellow yellow = new exercise5.Yellow();
        exercise5.Green green = new exercise5.Green();
        exercise5.Blue blue = new exercise5.Blue();
        exercise5.Indigo indigo = new exercise5.Indigo();
        exercise5.Violet violet = new exercise5.Violet();

    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }

}
