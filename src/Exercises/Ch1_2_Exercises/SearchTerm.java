package Exercises.Ch1_2_Exercises;

import java.util.Scanner;

public class SearchTerm {
    public static void main(String[] args) {
        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term: ");
        String searchTerm = input.next();

        if (paragraph.toLowerCase().contains(searchTerm.toLowerCase())) {
           System.out.println("Within paragraph: true");
           System.out.println("Index: " + paragraph.indexOf(searchTerm));
           System.out.println("Length: " + searchTerm.length());
           String updatedParagraph = paragraph.replaceAll(searchTerm, " ");
           System.out.println("Updated Paragraph: " + updatedParagraph);
        } else {
            System.out.println("false");
        }

    }
}
