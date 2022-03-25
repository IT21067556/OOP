import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Book book = new Book();
        Student student = new Student();
        Scanner scan = new Scanner(System.in);

        book.setScanner(scan);
        student.setScanner(scan);

        book.input();
        book.print();
        book.printDetails();

        student.input();
        student.print();
        student.printDetails();
    }
}
