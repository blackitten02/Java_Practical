import java.io.*;

class ThrowsDemo {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch(IOException e) {
            System.out.println("File not found");
        }
    }
}