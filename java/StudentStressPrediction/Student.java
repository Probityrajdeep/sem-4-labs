class Student {

    private int studyHours;
    private int sleepHours;
    private int examPressure;

    public Student(int studyHours, int sleepHours, int examPressure) {
        this.studyHours = studyHours;
        this.sleepHours = sleepHours;
        this.examPressure = examPressure;
    }

    public int getStudyHours() {
        return studyHours;
    }

    public int getSleepHours() {
        return sleepHours;
    }

    public int getExamPressure() {
        return examPressure;
    }
}