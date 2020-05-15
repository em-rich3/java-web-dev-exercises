package Studios.Studio6_Inheritance;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questionList;
    private int totalScore;
    private int totalPossibleScore;
    private int currentScore;

    public void addQuestion(Question question) {
        questionList.add(question);
    }

    public void removeQuestion(Question question) {
        questionList.remove(question);
    }


}
