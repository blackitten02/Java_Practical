class Book {

    private int bookId;
    private String title;
    private String author;
    private int availableCopies;

    public Book(int bookId, String title, String author, int copies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = copies;
    }

    public int getBookId() {
        return bookId;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void issueBook() {
        if (availableCopies > 0) {
            availableCopies--;
        }
    }

    public void returnBook() {
        availableCopies++;
    }

    public void displayBook() {
        System.out.println(bookId + " " + title + " " + author + " Copies:" + availableCopies);
    }
}