public class InputBook {
    private String name;
    private int publishYear;
    private int totalPages;
    enum Genre{
        ROMAN, FANTASY, DETECTIVE
    }
    private enum BookType {
        HANDWRITTEN, PRINTED
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public String getName() {
        return name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getTotalPages() {
        return totalPages;
    }


}
