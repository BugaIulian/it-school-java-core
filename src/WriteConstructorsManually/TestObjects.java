package WriteConstructorsManually;

import java.time.LocalDate;

public class TestObjects {
    Human testHuman = new Human("Iulian", "Buga", 'M', 18);
    Book testBook = new Book("Far Far Away", "James Brown", LocalDate.now().minusYears(100), 2100);
    App testApp = new App("Yazio", "Iulian", "123456", "Fitness");
    Website testWebsite = new Website("Mozaique", ".ro", "business website", 26);
    Album firstEdition = new Album("Cross","Florence and the machine",12,44.1,24);
}
