public class Book {

    private Long id;
    private String name;
    private int publishYear;
    private int totalPages;
    private Author[] authors;
    enum Genre{
        ROMAN, FANTASY, DETECTIVE
    }
    private enum BookType {
        HANDWRITTEN, PRINTED
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Long getId() {
        return id;
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

    public Author[] getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", totalPages=" + totalPages +
                '}';
    }
}
