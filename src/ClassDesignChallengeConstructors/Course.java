package ClassDesignChallengeConstructors;

public class Course {
    private String courseName;
    private String schedule;
    private int durationHours;
    private Professor assignedProfessor;
    private String courseDescription;

    public Course(String courseName, String schedule, int durationHours, Professor assignedProfessor, String courseDescription) {
        this.courseName = courseName;
        this.schedule = schedule;
        this.durationHours = durationHours;
        this.assignedProfessor = assignedProfessor;
        this.courseDescription = courseDescription;
    }
}
