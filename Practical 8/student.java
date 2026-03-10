class Student {
    private String name;
    private String regNo;
    private String contactNo;

    // Constructor
    public Student(String name, String regNo, String contactNo) {
        this.name = name;
        this.regNo = regNo;
        this.contactNo = contactNo;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    // Setter
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    // Display student details
    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Reg No: " + regNo);
        System.out.println("Contact No: " + contactNo);
    }
}