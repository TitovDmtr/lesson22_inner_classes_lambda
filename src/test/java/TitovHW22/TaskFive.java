package TitovHW22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TaskFive {
    public static void main(String[] args) {

//   Завдання 5.Користувач вводить набір чисел у вигляді одного рядка, наприклад: "1, 2, 3, 4, 4, 5".
//   Позбутися повторюваних елементів у рядку. Вивести результат на екран.

        Scanner scan = new Scanner(System.in);
        System.out.println("-- Now we need to type five separate string --");
        System.out.println("-- Remember! All duplicates will be deleted --");
        System.out.print("Enter 'first' string: ");
        String a = scan.nextLine();
        System.out.print("Enter 'second' string: ");
        String b = scan.nextLine();
        System.out.print("Enter 'third' string: ");
        String c = scan.nextLine();
        System.out.print("Enter 'fourth' string: ");
        String d = scan.nextLine();
        System.out.print("Enter 'fifth' string: ");
        String e = scan.nextLine();

        Set<String> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        set.add(e);

        System.out.println("Your string set without duplicates: ");
        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) { //check if there are elements
            String s = iterator1.next(); //get current element and move to the next
            System.out.println(s);
        }
    }
}
