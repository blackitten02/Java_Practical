class Student extends AbstractUser implements StudentOperations, AdvancedOperations {

    String name;
    int marks;

    @Override
    public void login() {
        System.out.println("User Logged In");
    }

    @Override
    public void addStudent(String name, int marks) {
        try {
            if (marks < 0 || marks > MAX_MARKS) {
                throw new InvalidMarksException("Invalid Marks!");
            }
            this.name = name;
            this.marks = marks;
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Resolving ambiguity
    @Override
    public void showMessage() {
        StudentOperations.super.showMessage();
        AdvancedOperations.super.showMessage();
        System.out.println("Resolved Ambiguity");
    }
}