package chapterTwoExercises;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        int first, second, third, fourth, fifth, largest, smallest;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        first = input.nextInt();

        System.out.print("Enter the second integer: ");
        second = input.nextInt();

        System.out.print("Enter the third integer: ");
        third = input.nextInt();

        System.out.print("Enter the fourth integer: ");
        fourth = input.nextInt();

        System.out.print("Enter the fifth integer: ");
        fifth = input.nextInt();

        largest = first;
        if(second > first) largest = second;
        if(third > largest) largest = third;
        if(fourth > largest) largest = fourth;
        if(fifth > largest) largest = fifth;

        smallest = first;
        if(second < first) smallest = second;
        if(third < smallest) smallest = third;
        if(fourth < smallest) smallest = fourth;
        if(fifth < smallest) smallest = fifth;

        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);

    }
}
