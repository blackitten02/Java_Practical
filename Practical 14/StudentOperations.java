interface StudentOperations {
    int MAX_MARKS = 100; 

    void addStudent(String name, int marks);
    void displayStudent();

    default void showMessage() {
        System.out.println("Default Method: Student Manager");
        helper();
    }

    static void staticInfo() {
        System.out.println("Static Method: Interface Info");
    }

    private void helper() {
        System.out.println("Private Method inside Interface");
    }
}