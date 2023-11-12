package TitovHW22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TaskSix {
    public static void main(String[] args) {

//   Завдання 6. Створити HashMap, що містить пари значень - ім'я іграшки та об'єкт іграшки
//   (клас Toy також створити з полями name, price). Перебрати та роздрукувати пари значень – entrySet().
//   Перебрати та роздрукувати набір із імен іграшок - keySet(). Перебрати та роздрукувати значення іграшок – values(). (Для кожного перебору створити свій метод)

        Map<String, Integer> map = new HashMap<>();
        map.put("Toy1", 500);
        map.put("Toy2", 700);
        map.put("Toy3", 620);
        map.put("Toy4", 230);

        TaskSix toys = new TaskSix();

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey(); //key
            int value = pair.getValue(); //value
            System.out.println(toys.toysData(pair.getKey(), pair.getValue()));
            System.out.print("Name: ");
            System.out.println(toys.toysName(pair.getKey()));
            System.out.print("Price: ");
            System.out.println(toys.toysPrice(pair.getValue()));
            System.out.println();
        }
    }

    public String toysData (String name, int price) {
        return name  + " :: " + price;
    }

    public String toysName (String name) {
        return name;
    }

    public int toysPrice (int price) {
        return price;
    }
}
