
import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];

            System.out.println("Question " + (i + 1) + ": " + question.getQuestionText());

            String[] options = question.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            int answer = -1;
            while (answer < 1 || answer > options.length) {
                System.out.print("Your answer (enter the option number): ");
                if (scanner.hasNextInt()) {
                    answer = scanner.nextInt();
                    if (answer < 1 || answer > options.length) {
                        System.out.println("Invalid option. Please choose a number between 1 and " + options.length);
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); 
                }
            }
            answer--; 

            if (question.isCorrectAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                int correctAnswerIndex = question.getCorrectOptionIndex();
                System.out.println("Incorrect! The correct answer was: " + (correctAnswerIndex + 1));
            }
            System.out.println();
        }

        System.out.println("Quiz finished! Your score: " + score + "/" + questions.length);
    }
}
