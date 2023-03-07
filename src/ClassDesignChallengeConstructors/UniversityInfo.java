package ClassDesignChallengeConstructors;

public class UniversityInfo {
    public static void main(String[] args) {

        Professor professor1 = new Professor("John", "Connor", "1891212050432", "Toronto", "8th Avenue", 12);
        Professor professor2 = new Professor("May", "Russel", "2911005050431", "New Orleans", "Spring Avenue", 57);
        Professor professor3 = new Professor("Kurt", "Gregory", "187020603643", "San Francisco", "Autumn Avenue", 15);
        Professor professor4 = new Professor("Anne", "Burns", "2052312054431", "New York", "Space Community Center", 143);
        Professor professor5 = new Professor("Janet", "Summers", "2931212040682", "London", "High Avenue", 24);
        Professor professor6 = new Professor("Ben", "Miller", "1880621964432", "Miami", "Fort Lauderdale", 21);
        Professor professor7 = new Professor("Pete", "Jackson", "18902020554478", "Montgomery", "Dothan", 36);
        Professor professor8 = new Professor("Paul", "O'Connelly", "1840618053851", "Fairbanks", "Beardsley", 17);

        Course mathCourse = new Course("Math can do wonders to your financial status.", "Monday", 8, professor1, "Discover Math with our highly decorated math professor John Connor, he traveled back from the future to teach you math.");
        Course computerScience = new Course("What is excel?", "Tuesday", 9, professor2, "May is here to help you turn on your computer. Everyday lessons from playing solitaire to setting your wallpaper on your freshly new computer.");
        Course physics = new Course("How an apple changed the history.", "Wednesday", 5, professor3, "Kurt is here to show you why you can't actually fly.");
        Course chemistry = new Course("Chemistry and what you eat.", "Thursday", 7, professor4, "Have you ever wondered why you get fat with age? Anne is here to show you why exactly?");
        Course biology = new Course("Biology or how I was made.", "Friday", 8, professor5, "Janet our biology teacher will show you exactly from what you're made, newsflash, it's not Tik Tok.");
        Course geography = new Course("Going Places", "Monday", 8, professor6, "Meet Ben. He lived two years in Antarctica without Waze. Learn exactly how to travel without GPS.");
        Course english = new Course("Is that bread or bun?", "Wednesday", 3, professor7, "Discover what K means in the new digital world of communication and why is important to sign your email with kind regards.");
        Course history = new Course("Why is that country an empire? Star Wars?", "Thursday", 2, professor8, "Paul is here to show you what happened last year.");
    }
}
