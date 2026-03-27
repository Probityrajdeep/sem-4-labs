class StressModel {

    public String predictStress(Student s) {

        int study = s.getStudyHours();
        int sleep = s.getSleepHours();
        int pressure = s.getExamPressure();

        if (study > 7 && sleep < 6 && pressure > 7) {
            return "High Stress";
        }
        else if (study < 5 && sleep > 7 && pressure < 5) {
            return "Low Stress";
        }
        else {
            return "Medium Stress";
        }
    }
}