package chapterTwoExercises;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        int currentPopulation = 800000000;
        int estimatedGrowth = 12;

        int yearOne = (currentPopulation * estimatedGrowth)/100;
        currentPopulation += yearOne;

        int yearTwo = (currentPopulation * estimatedGrowth)/100;
        currentPopulation += yearTwo;

        int yearThree = (currentPopulation * estimatedGrowth)/100;
        currentPopulation += yearThree;

        int yearFour = (currentPopulation * estimatedGrowth)/100;
        currentPopulation += yearFour;

        int yearFive = (currentPopulation * estimatedGrowth)/100;

        System.out.printf("The estimated growth after year one is: %d,%n" +
                "year two is: %d,%n" +
                "year three is: %d,%n" +
                "year four is: %d,%n" +
                "year five is: %d%n", yearOne, yearTwo, yearThree, yearFour, yearFive);

    }
}
