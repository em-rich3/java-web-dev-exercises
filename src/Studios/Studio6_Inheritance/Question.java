package Studios.Studio6_Inheritance;

public abstract class Question {
    private String prompt;
    private int pointValue;

    public Question(String aPrompt, int aPointValue) {
        prompt = aPrompt;
        pointValue = aPointValue;
    }

    public String getPrompt() { return prompt;  }

    public void setPrompt(String prompt) {this.prompt = prompt;  }

    public int getPointValue() {  return pointValue;   }

    public void setPointValue(int pointValue) {this.pointValue = pointValue;  }
}
