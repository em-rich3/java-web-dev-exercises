package Exercises.Ch3_Exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        Integer[] numbers = {1, 1, 2, 3, 5, 8};
        for (Integer number: numbers) {
            System.out.println(number);
        }

        for (int i = 0; i<numbers.length; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }

        }

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitSentenceSpace = sentence.split(" ");
        System.out.println(Arrays.toString(splitSentenceSpace));
        String[] splitSentencePeriod = sentence.split("\\.");
        System.out.println(Arrays.toString(splitSentencePeriod));


    }
}
