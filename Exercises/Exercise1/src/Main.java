import java.util.*;

public class Main {
    public static void main(String[] args) {
        Session session = new Session();
        // Add 20 students to the session
        for (int i = 1; i <= 20; i++) {
            Student student;
            if (i % 2 == 0) {
                student = new FullTimeStudent("Full-Time Student " + i, 70, 85);
            } else {
                student = new PartTimeStudent("Part-Time Student " + i);
            }

            // Add dummy quiz scores for each student
            for (int j = 1; j <= 15; j++) {
                student.addQuizScore(j * 10);
            }

            session.addStudent(student);
        }

// Call public methods of the session
        System.out.println("Class Average Quiz Score: " + session.getClassAverageQuizScore() + "\n");
        System.out.println("Quiz Scores In Ascending Order:");
        session.printQuizScoresInAscendingOrder();
        System.out.println();
        session.printPartTimeStudents();
        System.out.println();
        session.printFullTimeStudentsExamScores();
    }
}

