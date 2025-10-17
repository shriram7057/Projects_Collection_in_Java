
// QuizApp.java
import java.util.*;

class Question {
    String q;
    String[] opt;
    int ans;

    Question(String q, String[] opt, int ans) {
        this.q = q;
        this.opt = opt;
        this.ans = ans;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> qList = List.of(
                new Question("Java is ___?", new String[] { "Language", "OS", "Game" }, 1),
                new Question("OOP stands for?", new String[] { "Object Oriented Programming", "Output Oriented Program",
                        "Open Option Process" }, 1));
        int score = 0;
        for (Question q : qList) {
            System.out.println("\n" + q.q);
            for (int i = 0; i < q.opt.length; i++)
                System.out.println((i + 1) + ". " + q.opt[i]);
            int ans = sc.nextInt();
            if (ans == q.ans)
                score++;
        }
        System.out.println("✅ Final Score: " + score + "/" + qList.size());
    }
}
