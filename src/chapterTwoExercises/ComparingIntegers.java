package chapterTwoExercises;

import java.util.Scanner;

/*
(Comparing Integers) Write an application that asks the user to enter one integer, obtains
it from the user and displays whether the number and its square are greater than, equal to, not equal
to, or less than the number 100. Use the techniques shown in Fig. 2.15.
 */
public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hundred = 100;

        System.out.println("Enter an number: ");
        int number = input.nextInt();

        int square = number * number;

        if(number > hundred){
            System.out.println("The number you entered is greater than 100");
        }
        if(number == hundred){
            System.out.println("The number you entered is equal to 100");
        }
        if(number != hundred){
            System.out.println("The number you entered is not equal to 100");
        }
        if(number < hundred){
            System.out.println("The number you entered is less than 100");
        }

        if(square > hundred){
            System.out.println("The square of the number you entered is greater than 100");
        }
        if(square == hundred){
            System.out.println("The square of the number you entered is equal to 100");
        }
        if(square != hundred){
            System.out.println("The square of the number you entered is not equal to 100");
        }
        if(square < hundred){
            System.out.println("The square of the number you entered is less than 100");
        }

    }
}
