class Feet {
    private int feet;
    private int inches;

    // Constructor
    public Feet(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;

        fixInchOverflow();
    }

    // Constructor to copy data from another Feet object
    public Feet(Feet len) {
        feet = len.getFeet();
        inches = len.getInches();

        fixInchOverflow();
    }

    // Add f1+f2 feet and store in current feet
    public void add(Feet f1, Feet f2) {
        inches = f1.getInches() + f2.getInches();
        feet = f1.getFeet() + f2.getFeet();

        fixInchOverflow();
    }

    // Add values in another feet oject to this objects values
    public void add(Feet len) {
        feet = len.getFeet();
        inches = len.getInches();

        fixInchOverflow();
    }

    public static Feet add(Feet f1, Feet f2, Feet f3) {
        Feet newf = new Feet(f1.getFeet() + f2.getFeet() + f3.getFeet(),
                             f1.getInches() + f2.getInches() + f3.getInches());
        return newf;
    }

    // Display a Length e.g 5’6”
    public void print() {
        System.out.print(feet + "'" + inches + "\"");
    }

    public void println() {
        System.out.println(feet + "'" + inches + "\"");
    }

    // Display the length after the given string
    public void print(String msg) {
        System.out.print(msg + feet + "'" + inches + "\"");
    }

    public void println(String msg) {
        System.out.println(msg + feet + "'" + inches + "\"");
    }

    // static print method for any Feet object
    public static void print(Feet len) {
        System.out.print(len.getFeet() + "'" + len.getInches() + "\"");
    }

    public static void println(Feet len) {
        System.out.println(len.getFeet() + "'" + len.getInches() + "\"");
    }

    // Fixing inches being greater than 12
    private void fixInchOverflow() {
        feet += inches / 12;
        inches = inches % 12;
    }

    public int getFeet() {
        return feet;
    }

    public int getInches() {
        return inches;
    }
}
