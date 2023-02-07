package chapterTwoExercises;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstInteger = input.nextInt();

        System.out.print("Enter second integer: ");
        int secondInteger = input.nextInt();

        int squareOne = firstInteger * firstInteger;
        int squareTwo = secondInteger * secondInteger;

        int sumOfSquares = squareOne + squareTwo;
        int differenceOfSquares = squareOne - squareTwo;

        System.out.printf("The square of the first number is: %d%n" +
                "The square of the second number is: %d%n" +
                "The sum of their squares is: %d%n" +
                "The difference of their squares is: %d%n", squareOne, squareTwo, sumOfSquares, differenceOfSquares);
    }
}
