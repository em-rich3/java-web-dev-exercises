package Studios.Studio6_Inheritance;

import java.util.ArrayList;

public class TrueFalse extends Question {
    private Boolean correctAnswer;

    public TrueFalse(String aPrompt, Boolean aCorrectAnswer, int aPointValue) {
        super(aPrompt, aPointValue);
        correctAnswer = aCorrectAnswer;
    }

    public Boolean getCorrectAnswer() {return correctAnswer; }

    public void setCorrectAnswer(Boolean correctAnswer) {  this.correctAnswer = correctAnswer; }
}
