package WriteConstructorsManually;

public class Website {
    private String websiteName;
    private String websiteDomain;
    private String websiteInfo;
    private int websiteNumberOfPages;

    public Website(String websiteName, String websiteDomain, String websiteInfo, int websiteNumberOfPages) {
        this.websiteName = websiteName;
        this.websiteDomain = websiteDomain;
        this.websiteInfo = websiteInfo;
        this.websiteNumberOfPages = websiteNumberOfPages;
    }
}
