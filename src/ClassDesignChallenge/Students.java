package ClassDesignChallenge;

public class Students {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String birthDate;
    private int cnp;
    private String address;

    public Students(String firstName, String lastName, String sex, int age, String dateOfBirth, int cnp, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.birthDate = dateOfBirth;
        this.cnp = cnp;
        this.address = address;
    }
}
