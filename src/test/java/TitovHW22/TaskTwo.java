package TitovHW22;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

//   Завдання 2. Написати функціональний інтерфейс із методом, який приймає два рядки та повертає теж рядок.
//   Написати реалізацію такого інтерфейсу у вигляді лямбди, яка повертає той рядок, який довший.

        CompareStr compareStrings = new CompareStr() {
            public String compareStrings(String n, String k) {
                if (n.length() > k.length()) {
                    return n;
                } else
                    return k;
            };
        };

        System.out.print("Enter your first string: ");
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();

        System.out.print("Enter your second string: ");
        String k = scan.nextLine();


        String z = compareStrings.compareStrings(n, k);
        System.out.println(z);
    }
}

@FunctionalInterface
interface CompareStr {
    String compareStrings(String n, String k);
}