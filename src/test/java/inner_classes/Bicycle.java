package inner_classes;

public class Bicycle {
    private String model;
    private int weight;

    public Bicycle(String model, int weight) {
        this.model = model;
        this.weight = weight;
    }

    public static void start() {
//    public void start() {
        System.out.println("Ride!");
    }

    public static class HandleBarStatic {
        public void right() {
            System.out.println("right!");
        }

        public void left() {
            System.out.println("left!");
        }
    }

    public class HandleBar {
        public void right() {
            System.out.println("right!");
        }

        public void left() {
            System.out.println("left!");
        }
    }

    public class Seat {
        public void up() {
            System.out.println("higher");
        }

        public void down() {
            System.out.println("lower");
        }
    }
}