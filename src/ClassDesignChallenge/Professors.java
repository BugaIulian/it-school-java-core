package ClassDesignChallenge;

import java.time.LocalDate;

public class Professors {

    private String firstName;
    private String lastName;
    private char sex;
    private LocalDate dateOfBirth;
    private int age;
    private long cnp;
    private String address;

    public Professors(String firstName, String lastName, char sex, LocalDate dateOfBirth, int age, long cnp, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.cnp = cnp;
        this.address = address;
    }
}
