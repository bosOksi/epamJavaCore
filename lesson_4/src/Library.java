public class Library {

    public void addBook(Book book) {
        Storage.addBook(book);
    }

    public void addAuthor(Author author) {
        Storage.addAuthor(author);
    }

    public void printBooks() {
        for (int i = 0; i < Storage.books.length; i++) {
            Book book = Storage.books[i];
            if (book != null) {
                System.out.println(getBookAsStr(book));
            }
        }
    }

    private String getBookAsStr(Book book) {
        return book.toString();
    }

    public void printAuthors() {
        for (int i = 0; i < Storage.authors.length; i++) {
            Author author = Storage.authors[i];
            if (author != null) {
                System.out.println(getAuthorAsStr(author));
            }
        }
    }

    private String getAuthorAsStr(Author author) {
        return author.toString();
    }
}

