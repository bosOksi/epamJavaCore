public class LibraryDemo {
    public static void main(String[] args) {

        Library library = new Library();
        initData(library);

        library.printAuthors();
        library.printBooks();
    }

    private static void initData(Library library) {
        InputBook inputBook1 = new InputBook();
        inputBook1.setName("Evgeny Onegin");
        inputBook1.setPublishYear(1990);
        Book book1 = valueOf(inputBook1);


        InputBook inputBook2 = new InputBook();
        inputBook2.setName("Ruslan i Ludmila");
        inputBook2.setPublishYear(1995);
        Book book2 = valueOf(inputBook2);

        InputAuthor inputAuthor = new InputAuthor();
        inputAuthor.setLastName("Pushkin");
        inputAuthor.setYearOfBorn(1100);
        Author author = valueOf(inputAuthor);

        author.setBooks(new Book[] {book1,book2});
        book1.setAuthors(new Author[] {author});
        book2.setAuthors(new Author[] {author});

        library.addBook(book1);
        library.addBook(book2);
        library.addAuthor(author);

    }

    public static Book valueOf(InputBook inputBook) {
        Book book = new Book();
        book.setName(inputBook.getName());
        book.setPublishYear(inputBook.getPublishYear());
        return book;
    }
    public static Author valueOf(InputAuthor inputAuthor) {
        Author author = new Author(null);
        author.setLastName(inputAuthor.getLastName());
        author.setYearOfBorn(inputAuthor.getYearOfBorn());
        return author;
    }
}
