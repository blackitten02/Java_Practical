class LibStudent {

    private int studentId;
    private String name;
    private int booksIssued;

    public LibStudent(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.booksIssued = 0;
    }

    public int getStudentId() {
        return studentId;
    }

    public void issueBook() {
        booksIssued++;
    }

    public void returnBook() {
        booksIssued--;
    }
}