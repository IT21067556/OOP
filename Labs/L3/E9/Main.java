public class Main {
    public static void main(String args[]) {
        Pet p = new Pet("Lissie", "smith", 3);
        p.showDetails();

        Cat c = new Cat("Kyan", "Silva", 4, 4);
        c.showDetails();

        Pet pNewb = new Pet("Lissie", "smith");
        pNewb.showDetails();

        Cat cNewb = new Cat("Kyan", "Silva");
        cNewb.showDetails();
    }
}
