package ClassDesignChallenge;

public class Courses {

    private String courseName;
    private String schedule;
    private int durationHours;
    private Professors assignedProfessor;
    private String courseDescription;

    public Courses(String courseName, String schedule, int durationHours, Professors assignedProfessor, String courseDescription) {
        this.courseName = courseName;
        this.schedule = schedule;
        this.durationHours = durationHours;
        this.assignedProfessor = assignedProfessor;
        this.courseDescription = courseDescription;
    }
}
