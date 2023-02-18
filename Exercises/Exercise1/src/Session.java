import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Session {
    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public double getClassAverageQuizScore() {
        int sum = 0;
        int totalQuizzes = 0;
        for (Student student : students) {
            sum += student.quizzes.size() * student.getAverageQuizScore();
            totalQuizzes += student.quizzes.size();
        }
        return sum / totalQuizzes;
    }

    public void printQuizScoresInAscendingOrder() {
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return (int)(s1.getAverageQuizScore() - s2.getAverageQuizScore());
            }
        });
        for (Student student : students) {
            System.out.println(student.name + ": " + student.quizzes);
        }
    }

    public void printPartTimeStudents() {
        System.out.println("Name List of Part-Time Students:");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println(student.name);
            }
        }
    }

    public void printFullTimeStudentsExamScores() {
        System.out.println("Exam Scores of Full-Time Students:");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                FullTimeStudent fullTimeStudent = (FullTimeStudent)student;
                System.out.println(fullTimeStudent.name);
                fullTimeStudent.printExamScores();
            }
        }
    }
}


