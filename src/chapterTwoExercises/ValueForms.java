package chapterTwoExercises;

import java.util.Scanner;

public class ValueForms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber;
        int positives =0, negatives =0, zeros=0;

        System.out.print("Enter first number: ");
        firstNumber = input.nextInt();
        if(firstNumber < 0) negatives = negatives + 1;
        if(firstNumber == 0) zeros = zeros +1;
        if(firstNumber > 0) positives = positives +1;

        System.out.print("Enter second number: ");
        secondNumber = input.nextInt();
        if(secondNumber < 0) negatives = negatives + 1;
        if(secondNumber == 0) zeros = zeros +1;
        if(secondNumber > 0) positives = positives +1;

        System.out.print("Enter third number: ");
        thirdNumber = input.nextInt();
        if(thirdNumber < 0) negatives = negatives + 1;
        if(thirdNumber == 0) zeros = zeros +1;
        if(thirdNumber > 0) positives = positives +1;

        System.out.print("Enter fourth number: ");
        fourthNumber = input.nextInt();
        if(fourthNumber < 0) negatives = negatives + 1;
        if(fourthNumber == 0) zeros = zeros +1;
        if(fourthNumber > 0) positives = positives +1;

        System.out.print("Enter fifth number: ");
        fifthNumber = input.nextInt();
        if(fifthNumber < 0) negatives = negatives + 1;
        if(fifthNumber == 0) zeros = zeros +1;
        if(fifthNumber > 0) positives = positives +1;

        System.out.printf("The number of positives are/is: %d,%n" +
                "the number of zeros are/is: %d,%n" +
                "the number of negatives are/is: %d.", positives, zeros, negatives);
    }
}
