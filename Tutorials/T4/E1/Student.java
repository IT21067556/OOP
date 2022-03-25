import java.util.Scanner;

class Student implements IDisplay, IInput {
    private String studentID, name;
    private Scanner scan;
    
    public void input() {
        System.out.println("Enter Student ID: ");
        this.studentID = scan.next();
        System.out.println("Enter Student Name: ");
        this.name = scan.next();
    }

    public void print() {
        System.out.println(studentID + " " + name);
    }

    public void printDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Title: " + name);
    }

    public void setScanner(Scanner scan) {
        this.scan = scan;
    }
}
