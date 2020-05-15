package Studios.Studio6_Inheritance;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private ArrayList<String> answerChoices;
    private String correctAnswer;

    public MultipleChoice(String aPrompt, ArrayList<String> aAnswerChoices, String aCorrectAnswer, int aPointValue) {
        super(aPrompt, aPointValue);
        answerChoices = aAnswerChoices;
        correctAnswer = aCorrectAnswer;
    }

    public void addMultipleChoiceOption(String aOption) {
        answerChoices.add(aOption);
    }

    public ArrayList<String> getAnswerChoices() { return answerChoices; }

    public void setAnswerChoices(ArrayList<String> answerChoices) { this.answerChoices = answerChoices;   }

    public String getCorrectAnswer() {return correctAnswer; }

    public void setCorrectAnswer(String correctAnswer) { this.correctAnswer = correctAnswer;  }
}
