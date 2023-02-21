package chapterTwoExercises;
/*
Write an application that inputs three integers from the
user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
representation of the average. So, if the sum of the values is 7, the average should be 2, not
2.3333….]
 */

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int firstInteger = input.nextInt();

        System.out.println("Enter second integer: ");
        int secondInteger = input.nextInt();

        System.out.println("Enter third integer: ");
        int thirdInteger = input.nextInt();

        int sum = firstInteger + secondInteger + thirdInteger;
        int average = sum/3;
        int product = firstInteger * secondInteger * thirdInteger;

        int smallestInteger = firstInteger;
        if (secondInteger < firstInteger) smallestInteger = secondInteger;
        if (thirdInteger < smallestInteger) smallestInteger = thirdInteger;

        int largestInteger = firstInteger;
        if (secondInteger > firstInteger) largestInteger = secondInteger;
        if (thirdInteger > smallestInteger) largestInteger = thirdInteger;

        System.out.printf("The sum of the numbers is: %d%n" +
                "The average of the numbers is: %d%n" +
                "The product of the numbers is: %d%n" +
                "The smallest of the numbers is: %d%n" +
                "The largest of the numbers is: %d",
                sum, average, product, smallestInteger, largestInteger);

    }
}
