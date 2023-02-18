import java.util.ArrayList;

public class Student {
        String name;
        ArrayList<Integer> quizzes = new ArrayList<Integer>();

        public Student(String name) {
            this.name = name;
        }

        public void addQuizScore(int score) {
            quizzes.add(score);
        }

        public double getAverageQuizScore() {
            int sum = 0;
            for (int quizScore : quizzes) {
                sum += quizScore;
            }
            return sum / quizzes.size();
        }

        public void printQuizScores() {
            System.out.println(quizzes);
        }
    }
