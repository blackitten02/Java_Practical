import java.util.Scanner;

public class SMS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Management mg = new Management();

        while(true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Reg No: ");
                    String reg = sc.nextLine();

                    System.out.print("Enter Contact No: ");
                    String contact = sc.nextLine();

                    Student s = new Student(name, reg, contact);
                    mg.addStudent(s);
                    break;

                case 2:
                    System.out.print("Enter Reg No: ");
                    String r = sc.nextLine();
                    mg.searchStudent(r);
                    break;

                case 3:
                    mg.displayAllStudents();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}