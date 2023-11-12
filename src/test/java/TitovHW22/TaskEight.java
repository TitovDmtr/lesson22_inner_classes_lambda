package TitovHW22;

public class TaskEight {
    public static void main(String[] args) {

//   Завдання 8.Завдання з generic. Написати метод, який на вхід отримує колекцію об'єктів, а повертає колекцію без дублікатів.
//   Перевірити цей метод на деяких типах и класах.

        // instance of Integer type
        GenericTest<Integer> iObject = new GenericTest<Integer>(15);
        System.out.println(iObject.getObject());

        // instance of String type
        GenericTest<String> sObject = new GenericTest<String>("GeeksForGeeks");
        System.out.println(sObject.getObject());

        // need to finish this task !!!

    }


}

class GenericTest<T> {
    T object;

    GenericTest(T obj) {
        this.object = object;
    }

    public T getObject() {
        return this.object;
    }
}
