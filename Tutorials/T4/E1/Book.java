import java.util.Scanner;

class Book implements IDisplay, IInput {
    private String bookID, title, publisher;
    private Scanner scan;
    
    public void input() {
        System.out.println("Enter Book ID: ");
        this.bookID = scan.next();
        System.out.println("Enter Book Title: ");
        this.title = scan.next();
        System.out.println("Enter Book Publisher: ");
        this.publisher = scan.next();
    }

    public void print() {
        System.out.println(bookID + " " + title + " " + publisher);
    }

    public void printDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Book Title: " + title);
        System.out.println("Book Publisher: " + publisher);
    }

    public void setScanner(Scanner scan) {
        this.scan = scan;
    }
}
