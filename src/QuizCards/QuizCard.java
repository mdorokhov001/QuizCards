package QuizCards;

public class QuizCard {

    private String question;
    public String answer;

    public QuizCard(String q, String a){
        this.question = q;
        this.answer = a;
    }

    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }
}
