public class Storage {

    public static final int CAPACITY = 10;

    public static Book[] books = new Book[CAPACITY];
    public static int bookIndex = 0;
    public static void increaseBookIndex() {
        bookIndex++;
    }
    public static Author[] authors = new Author[CAPACITY];
    public static int authorIndex = 0;
    public static void increaseAuthorIndex() {
        authorIndex++;
    }
    public static void increaseAuthorsStorage() {


        Author[] authors = new Author[authorIndex + CAPACITY];
        System.arraycopy(Storage.authors, 0, authors,0,CAPACITY);
        Storage.authors = authors;

    }

    public static void increaseBooksStorage() {


        Book[] books = new Book[bookIndex + CAPACITY];
        System.arraycopy(Storage.books, 0, books,0,CAPACITY);
        Storage.books = books;

    }

    public static void addAuthor(Author author) {
        author.setId(System.currentTimeMillis());

        if (Storage.authorIndex % (Storage.CAPACITY) == 0 && Storage.authorIndex != 0) {
            Storage.increaseAuthorsStorage();
        } else {
            Storage.authors[Storage.authorIndex] = author;
        }
        Storage.increaseAuthorIndex();
    }

    public static void addBook(Book book) {
        book.setId(System.currentTimeMillis());

        if (Storage.bookIndex % (Storage.CAPACITY) == 0 && Storage.bookIndex != 0) {
            Storage.increaseBooksStorage();
        } else {
            Storage.books[Storage.bookIndex] = book;
        }
        Storage.increaseBookIndex();
    }
}
