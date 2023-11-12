package TitovHW22;

import java.util.ArrayList;

public class TaskNine {
    public static void main(String[] args) {

//   Завдання 9. Створити список рядків. Ввести з клавіатури якусь кількість рядків. Використовуючи цикл знайти найдовший рядок.

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("12345");
        arrayList.add("1234567890");
        arrayList.add("1234567890");
        arrayList.add("Ut convallis justo porttitor sem vulputate, quis luctus erat cursus");
        int largestString = arrayList.get(0).length();
        int index = 0;

        for(int i = 0; i < arrayList.size(); i++)
        {
            if(arrayList.get(i).length() > largestString)
            {
                largestString = arrayList.get(i).length();
                index = i;
            }
        }
        System.out.println("Index [" + index + "]: '"+ arrayList.get(index) + "' is the largest with size: " + largestString);
    }
}
