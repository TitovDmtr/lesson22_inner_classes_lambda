package TitovHW22;

import java.util.Scanner;
import java.lang.Math;

public class TaskFour {
    public static void main(String[] args) {

//   Завдання 4. Використовуючи функціональний інтерфейс із завдання 3 написати лямбда-вираз, який повертає результат операції a*b^c.

        CalculateDiscriminant calculateDiscriminant = new CalculateDiscriminant() {
            public int calculateD(int a, int b, int c) {
                return a * (int) Math.pow(b, c);
            };
        };

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'a': ");
        int a = scan.nextInt();

        System.out.print("Enter 'b': ");
        int b = scan.nextInt();

        System.out.print("Enter 'c': ");
        int c = scan.nextInt();

        double result = calculateDiscriminant.calculateD(a, b, c);
        System.out.println("Result is: a * b^c = " + result);
    }
}
