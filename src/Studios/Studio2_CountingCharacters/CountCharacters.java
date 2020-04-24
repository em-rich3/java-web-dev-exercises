package Studios.Studio2_CountingCharacters;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

//        String exampleSentence = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInSentence = sentence.toLowerCase().toCharArray();

        HashMap<Character, Integer> characterCountList = new HashMap<>();

        for (char character: charactersInSentence) {
            if (characterCountList.containsKey(character)) {
                characterCountList.put(character, characterCountList.get(character) + 1);
            } else {
                  characterCountList.put(character, 1);
            }
        }

        System.out.println(characterCountList);
    }
}
