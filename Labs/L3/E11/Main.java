public class Main {
    public static void main(String args[]) {
        Cat c = new Cat("Whiskers", "Devmini", 4, 6);
        c.showDetails();

        Pet p3 = c;
        p3.showDetails();

        Dog d = new Dog("Spotter", "Adrian");
        d.showDetails();
    }
}
