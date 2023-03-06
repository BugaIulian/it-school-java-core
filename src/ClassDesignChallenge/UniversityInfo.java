package ClassDesignChallenge;

import java.time.LocalDate;

public class UniversityInfo {
    public static void main(String[] args) {

        Professors professor1 = new Professors("John", "Connor", 'M', LocalDate.of(1989, 12, 12), 33, 1891212050432L, "Canada, 8th Avenue, Apartment 12");
        Professors professor2 = new Professors("May", "Russel", 'F', LocalDate.of(1991, 10, 5), 30, 2911005050431L, "New Orleans, Spring Avenue, Apartment 57");
        Professors professor3 = new Professors("Kurt", "Gregory", 'M', LocalDate.of(1987, 2, 6), 36, 1870206036432L, "San Francisco, Autumn Avenue, Apartment 15");
        Professors professor4 = new Professors("Anne", "Burns", 'F', LocalDate.of(1990, 5, 23), 32, 2052312054431L, "New York, Space Community Center, 143");
        Professors professor5 = new Professors("Janet", "Summers", 'F', LocalDate.of(1993, 2, 12), 29, 2931212040682L, "London, High Avenue, 24");
        Professors professor6 = new Professors("Ben", "Miller", 'M', LocalDate.of(1988, 6, 21), 34, 1880621964432L, "Florida, Fort Lauderdale, 21");
        Professors professor7 = new Professors("Pete", "Jackson", 'M', LocalDate.of(1989, 2, 2), 33, 18902020554478L, "Alabama, Dothan, 36");
        Professors professor8 = new Professors("Paul", "O'Connelly", 'M', LocalDate.of(1984, 6, 18), 33, 1840618053851L, "Alaska, Beardsley, 17");

        Courses mathCourse = new Courses("Math can do wonders to your financial status.", "Monday", 8, professor1, "Discover Math with our highly decorated math professor John Connor, he traveled back from the future to teach you math.");
        Courses computerScience = new Courses("What is excel?", "Tuesday", 9, professor2, "May is here to help you turn on your computer. Everyday lessons from playing solitaire to setting your wallpaper on your freshly new computer.");
        Courses physics = new Courses("How an apple changed the history.", "Wednesday", 5, professor3, "Kurt is here to show you why you can't actually fly.");
        Courses chemistry = new Courses("Chemistry and what you eat.", "Thursday", 7, professor4, "Have you ever wondered why you get fat with age? Anne is here to show you why exactly?");
        Courses biology = new Courses("Biology or how I was made.", "Friday", 8, professor5, "Janet our biology teacher will show you exactly from what you're made, newsflash, it's not Tik Tok.");
        Courses geography = new Courses("Going Places", "Monday", 8, professor6, "Meet Ben. He lived two years in Antarctica without Waze. Learn exactly how to travel without GPS.");
        Courses english = new Courses("Is that bread or bun?", "Wednesday", 3, professor7, "Discover what K means in the new digital world of communication and why is important to sign your email with kind regards.");
        Courses history = new Courses("Why is that country an empire? Star Wars?", "Thursday", 2, professor8, "Paul is here to show you what happened last year.");
    }
}
