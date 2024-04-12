package Modul_2_5;

import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) {
        int sum = 0;
        int limit = 5000;
        int counter = 0;
        int generatedNumber = 0;
        int max = 0;
        int min = 50;
        while (sum <= limit) {
            generatedNumber = getRandomInt();
            sum += generatedNumber;
            ++counter;
            max = getMax(generatedNumber, max);
            min = getMin(generatedNumber, min);
            System.out.println("Suma: " + sum);
            System.out.println("ilość przejść: " + counter + "\n");

        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Średnia: " + (sum / counter));

    }

    public static int getRandomInt() {
        Random generator = new Random();
        return generator.nextInt(51);
    }

    public static int getMax(int generatedNumber, int max) {
        if (generatedNumber > max) {
            return generatedNumber;
        } else {
            return max;
        }
    }

    public static int getMin(int generatedNumber, int min) {
        if (generatedNumber < min) {
            return generatedNumber;
        } else {
            return min;
        }
    }

}
