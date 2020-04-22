package Ch3_Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(12);
        numbers.add(14);
        numbers.add(16);
        numbers.add(18);
        numbers.add(20);
        Integer sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);

//        ArrayList<String> words = new ArrayList<>();
//        words.add("Emily");
//        words.add("Car");
//        words.add("Bagels");
//        words.add("Fox");
//        words.add("Hunt");
//        words.add("Fives");
        String arrayPracticeString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String splitString[] = arrayPracticeString.split(" ");
        List<String> splitStringArrayList = new ArrayList<String>();
        splitStringArrayList = Arrays.asList(splitString);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter search word length: ");
        Integer wordLength = input.nextInt();
        for (String word: splitStringArrayList) {
            if (word.length() == wordLength) {
                System.out.println(word);
            }
        }

    }
}
