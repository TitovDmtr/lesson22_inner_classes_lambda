package inner_classes;

public class MainBicycle {
    public static void main(String[] args) {
        // Example 1
        Bicycle.HandleBarStatic handleBarStatic = new Bicycle.HandleBarStatic();
        Bicycle.HandleBarStatic handleBarStatic1 = new Bicycle.HandleBarStatic();

        // Example 2
        Bicycle peugeot = new Bicycle("Peugeot", 120);

        Bicycle.HandleBar handleBar = peugeot.new HandleBar();
        Bicycle.HandleBar handleBar1 = peugeot.new HandleBar();

        Bicycle.Seat seat = peugeot.new Seat();

        seat.up();  // Відрегулювали сидіння
        peugeot.start(); // Почали іхати
        handleBar.left(); // Повернули ліворуч
        handleBar.right(); // Повернули праворуч

        Bicycle.start();
        handleBar1.left();
        handleBar1.right();

    }
}