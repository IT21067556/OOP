public class Cat extends Pet {
    private int livesLeft;

    public Cat(String n, String o, int a, int l) {
        super(n, o, a);
        this.livesLeft = l;
    }

    public Cat(String n, String o) {
        super(n, o);
        this.livesLeft = 9;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("I am a cat. " + this.livesLeft +
                           " lieves remain for me");
    }
}
