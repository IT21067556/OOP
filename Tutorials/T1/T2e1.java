import java.util.Scanner;

public class T2e1 {
    public static void main(String args[]) {
        Student stud1 = new Student("ID001", "Sahan");
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the marks for subject 1 : ");
        int mark1 = inp.nextInt();
        System.out.println("Enter the marks for subject 2 : ");
        int mark2 = inp.nextInt();
        System.out.println("Enter the marks for subject 3 : ");
        int mark3 = inp.nextInt();

        stud1.setMarks(mark1, mark2, mark3);
        stud1.calcAvg();
        stud1.displayInfo();

        inp.close();
    }
}

class Student {
    private String id;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;
    private float avg;

    Student(String id, String name) {
        this.id = id;
        this.name = name;
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    void setMarks(int m1, int m2, int m3) {
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }

    void calcAvg() {
        avg = ((float)mark1 + (float)mark2 + (float)mark3) / 3;
    }

    void displayInfo() {
        System.out.println("Student  name: " + name);
        System.out.println("Student    id: " + id);
        System.out.println("Average marks: " + avg);
    }
}

