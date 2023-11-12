package TitovHW22;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {

//   Завдання 10. Створити список рядків. Вводити з клавіатури якусь кількість рядків, але додавати кожний рядок
//   не в кінець списку, а на початок списку. Використовуючи цикл, вивести всі рядки на екран, кожен з нового рядка.

        Scanner scan = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 1; i < 5; i++) {
            System.out.print("Enter '" + i +"' string: ");
            String newString = scan.nextLine();
            linkedList.addFirst(newString);
        }
        System.out.println();

        Iterator<String> iteratorLinkedList = linkedList.iterator();

        while (iteratorLinkedList.hasNext()) { //check if there are elements
            String s = iteratorLinkedList.next(); //get current element and move to the next
            System.out.println(s);
        }
    }
}
