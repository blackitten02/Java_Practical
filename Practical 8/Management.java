import java.util.ArrayList;

class Management {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(String regNo) {
        for (Student s : students) {
            if (s.getRegNo().equals(regNo)) {
                students.remove(s);
                break;
            }
        }
    }

    public void searchStudent(String regNo) {
        for (Student s : students) {
            if (s.getRegNo().equals(regNo)) {
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void displayAllStudents() {
        for (Student s : students) {
            s.displayStudent();
            System.out.println("----------------");
        }
    }
}