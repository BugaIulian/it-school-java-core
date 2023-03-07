package ClassDesignChallengeConstructors;

public class Professor {

    private String firstName;
    private String lastName;
    private String cnp;
    private String addressCity;
    private String addressStreet;
    private int addressApartmentNr;

    public Professor(String firstName, String lastName, String cnp, String addressCity, String addressStreet, int addressApartmentNr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cnp = cnp;
        this.addressCity = addressCity;
        this.addressStreet = addressStreet;
        this.addressApartmentNr = addressApartmentNr;
    }
}
