package TitovHW22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TaskSeven {
    public static void main(String[] args) {

//   Завдання 7. Створити клас Pet та його спадкоємців Cat, Dog, Parrot. Створити Map з домашніх тварин,
//   де як ключ виступає ім'я тварини, а як значення клас Pet. Додати у цю Map різних тварин.
//   Створити метод, який виводить на консоль усі ключі Map.

        Pet cat1 = new Cat();
        cat1.setName("Emma");
        Pet cat2 = new Cat();
        cat2.setName("Pumpkin");

        Pet dog1 = new Dog();
        dog1.setName("Korni");
        Pet dog2 = new Dog();
        dog2.setName("Tom");

        Pet parrot1 = new Parrot();
        parrot1.setName("Green");
        Pet parrot2 = new Parrot();
        parrot2.setName("Beautty");

        Map<String, String> mapPets = new HashMap<>();
        mapPets.put(cat1.getName(), "Pet");
        mapPets.put(dog1.getName(), "Pet");
        mapPets.put(parrot1.getName(), "Pet");
        mapPets.put(cat2.getName(), "Pet");
        mapPets.put(dog2.getName(), "Pet");
        mapPets.put(parrot2.getName(), "Pet");

        TaskSeven petsName = new TaskSeven();

        petsName.petsName(mapPets);
    }

    public void petsName (Map<String, String> mapPets) {
        Iterator<Map.Entry<String, String>> iterator = mapPets.entrySet().iterator();
        while (iterator.hasNext()) { //check if there are elements
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey(); //key
            System.out.println(key);
        }
    }
}
