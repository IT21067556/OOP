class Main {
    public static void main(String args[]) {
        Feet feet1, feet2, feet3, feet4;

        feet1 = new Feet(3, 8);       

        feet1.print();
        feet1.print("Length: ");
        Feet.print(feet1);
        feet1.println();
        feet1.println("Length= ");
        Feet.println(feet1);

        feet2 = new Feet(feet1);
        feet2.println();

        feet3 = new Feet(0, 0);
        feet3.add(feet1, feet2);
        feet3.println();

        feet3.add(feet1);
        feet3.println();

        feet4 = Feet.add(feet1, feet2, feet3);
        feet4.println();
    }
}
