package chapterTwoExercises;


import java.util.Scanner;

/*
(Multiples) Write an application that reads two integers, determines whether the first
number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
remainder operator.]
 */
public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int tripled = firstNumber * firstNumber * firstNumber;
        int doubled = secondNumber * secondNumber;

        if(tripled % doubled == 0)
            System.out.println("The first number tripled is a multiple of the second number doubled");
        else
            System.out.println("The first number tripled is NOT a multiple of the second number doubled");

        System.out.println("The first number tripled is: " + tripled);
        System.out.println("The second number doubled is: " + doubled);
    }
}
