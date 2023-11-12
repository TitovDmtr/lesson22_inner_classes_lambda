package TitovHW22;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

//        Завдання 3. Написати функціональний інтерфейс із методом, який приймає три дробові числа (double): a, b, c
//        і повертає теж дробове число. Написати реалізацію такого інтерфейсу як лямбда-виразу, яке повертає дискримінант (D = b^2 - 4ac).

        CalculateDiscriminant calculateDiscriminant = new CalculateDiscriminant() {
            public int calculateD(int a, int b, int c) {
                return b * b - 4 * a * c;
            };
        };

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 'a': ");
        int a = scan.nextInt();

        System.out.print("Enter 'b': ");
        int b = scan.nextInt();

        System.out.print("Enter 'c': ");
        int c = scan.nextInt();

        double D = calculateDiscriminant.calculateD(a, b, c);
        System.out.println("Discriminant = " + D);
    }
}

@FunctionalInterface
interface CalculateDiscriminant {
    int calculateD(int a, int b, int c);
}
