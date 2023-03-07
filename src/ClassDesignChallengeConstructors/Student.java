package ClassDesignChallengeConstructors;

public class Student {
    private String firstName;
    private String lastName;
    private int cnp;
    private String address;

    public Student(String firstName, String lastName, int cnp, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
        this.address = address;
    }
}
