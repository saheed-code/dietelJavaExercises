package chapterTwoExercises;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber;

        firstNumber = (number/10000);
        secondNumber = (number%10000)/1000;
        thirdNumber = ((number%10000)%1000)/100;
        fourthNumber = (((number%10000)%1000)%100)/10;
        fifthNumber = (((number%10000)%1000)%100)%10;

        System.out.printf("%d %d %d %d %d", firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);

    }
}
