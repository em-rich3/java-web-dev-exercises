package Studios.Studio6_Inheritance;

import java.util.ArrayList;

public class Checkbox extends Question{
    private ArrayList<String> answerChoices;
    private ArrayList<String> correctAnswerCombination;

    public Checkbox(String aPrompt, ArrayList<String> aAnswerChoices, ArrayList<String> aCorrectAnswerCombination, int aPointValue) {
        super(aPrompt, aPointValue);
        answerChoices = aAnswerChoices;
        correctAnswerCombination = aCorrectAnswerCombination;
    }

    public void addCheckBoxOption(String aOption) {
        answerChoices.add(aOption);
    }

    public ArrayList<String> getAnswerChoices() { return answerChoices;  }

    public void setAnswerChoices(ArrayList<String> answerChoices) {this.answerChoices = answerChoices;  }

    public ArrayList<String> getCorrectAnswerCombination() {return correctAnswerCombination; }

    public void setCorrectAnswerCombination(ArrayList<String> correctAnswerCombination) { this.correctAnswerCombination = correctAnswerCombination; }
}
