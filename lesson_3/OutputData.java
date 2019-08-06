public class OutputData {
    private String authorFamilyName, authorName, authorPatronymic;
    private String bookTitle;
    private String publishingHouse;
    private int year;


    public String getAuthorFamilyName() {
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

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorFamilyName(String authorFamilyName) {
        this.authorFamilyName = authorFamilyName;
    }

    public void setAuthorPatronymic(String authorPatronymic) {
        this.authorPatronymic = authorPatronymic;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printOutput() {
        System.out.println("" + getAuthorFamilyName() + getAuthorName() +"; "  + "; " + getAuthorPatronymic() + "; "
                + getBookTitle() +
                "; " + getPublishingHouse() + "; " + getYear());
    }
}
