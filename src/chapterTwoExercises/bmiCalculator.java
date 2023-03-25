package chapterTwoExercises;

import java.util.Scanner;

public class bmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextInt();

        System.out.print("Enter your height in meters: ");
        double height = input.nextInt();

        System.out.println("""
                The BMI Categories are:
                Underweight = <18.5
                Normal weight = 18.5 – 24.9
                Overweight = 25 – 29.9
                Obesity = BMI of 30 or greater
                """);

        double bmi = weight/(height * height);

        System.out.println("Your bmi is: " + bmi);
    }
}
