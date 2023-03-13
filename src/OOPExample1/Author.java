package OOPExample1;

public class Author extends Utils {
    String awards;
    String agency;

    public Author(String authorFirstName, String authorSecondName, String genre, String awards, String agency) {
        super(authorFirstName, authorSecondName, genre);
        this.awards = awards;
        this.agency = agency;
    }
}
