class FullTimeStudent extends Student {
        int exam1Score;
        int exam2Score;

        public FullTimeStudent(String name, int exam1Score, int exam2Score) {
            super(name);
            this.exam1Score = exam1Score;
            this.exam2Score = exam2Score;
        }

        public void printExamScores() {
            System.out.println("Exam 1 Score: " + exam1Score);
            System.out.println("Exam 2 Score: " + exam2Score);
        }
    }
