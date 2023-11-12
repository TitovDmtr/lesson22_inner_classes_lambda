package TitovHW22;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

//    Завдання 1. Написати функціональний інтерфейс із методом, який приймає число та повертає булеве значення.
//    Написати реалізацію такого інтерфейсу як лямбда-виразу, яке повертає true якщо передане число ділиться без залишку на 13.
        Math math = (n, d) -> n % d;

        System.out.print("Enter your number:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (math.calculate(n, 13) == 0) {
            System.out.println("true");
        } else
            System.out.println("false");;
    }
}

@FunctionalInterface
interface Math {
    int calculate(int n, int k);
}
