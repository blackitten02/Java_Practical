import java.util.Scanner;

public class LibrarySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while(true) {

            System.out.println("\n1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");

            int ch = sc.nextInt();

            switch(ch) {

                case 1:
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Copies: ");
                    int copies = sc.nextInt();

                    lib.addBook(new Book(id, title, author, copies));
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    lib.issueBook(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    lib.returnBook(sc.nextInt());
                    break;

                case 4:
                    lib.displayBooks();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}