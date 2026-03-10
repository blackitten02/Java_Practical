import java.util.ArrayList;

class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void issueBook(int bookId) {

        for(Book b : books) {
            if(b.getBookId() == bookId) {
                b.issueBook();
                System.out.println("Book issued");
                return;
            }
        }

        System.out.println("Book not found");
    }

    public void returnBook(int bookId) {

        for(Book b : books) {
            if(b.getBookId() == bookId) {
                b.returnBook();
                System.out.println("Book returned");
                return;
            }
        }

        System.out.println("Book not found");
    }

    public void displayBooks() {
        for(Book b : books) {
            b.displayBook();
        }
    }
}