public class InputData {

    private String authorName, authorFamilyName, authorPatronymic;
    private String bookTitle;
    private String publishingHouse;
    private int year;


    public InputData( String authorFamilyName, String authorName, String authorPatronymic, String bookTitle,
                      String publishingHouse, int year) {
        this.authorFamilyName=authorFamilyName;
        this.authorName=authorName;
        this.authorPatronymic=authorPatronymic;
        this.bookTitle=bookTitle;
        this.publishingHouse=publishingHouse;
        this.year=year;

    }

    public String getAuthorFamilyName(String authorFamilyName) {
        return authorFamilyName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorPatronymic() {
        return authorPatronymic;
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYear() {
        return year;
    }

}
