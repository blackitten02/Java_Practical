import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        s.login();
        s.systemAccess();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        s.addStudent(name, marks);
        s.displayStudent();

        s.showMessage();

        StudentOperations.staticInfo();

        sc.close();
    }
}