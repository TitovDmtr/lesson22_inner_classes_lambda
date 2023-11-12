package TitovHW22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Comparator.comparing;

public class TaskNine {
    public static void main(String[] args) {

//   Завдання 9. Створити список рядків. Ввести з клавіатури якусь кількість рядків. Використовуючи цикл знайти найдовший рядок.

        // Find max size string with 'stream().max'
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("12345");
//        arrayList.add("1234567890");
//        arrayList.add("1234567890");
//        arrayList.add("Ut convallis justo porttitor sem vulputate, quis luctus erat cursus");
//
//        String max = arrayList.stream().max(comparing(String::length)).get();
//        System.out.println("The largest string is: " + max);

        // Find max size string with 'for' cycle
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
