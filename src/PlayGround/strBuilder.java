package PlayGround;

public class strBuilder {
    public static void main(String[] args) {
        welcomeVisitors("english");
    }

    private static String welcomeVisitors(String language) {
            StringBuilder exitString = new StringBuilder();
            exitString.append(language);

        return exitString.toString();
    }

}

