class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class UserDefinedDemo {
    public static void main(String[] args) {
        int marks = 30;

        try {
            if(marks < 40) {
                throw new MyException("Fail");
            } else {
                System.out.println("Pass");
            }
        } catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }
}