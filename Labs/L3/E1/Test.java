class Test {
    public static void main(String args[]) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Sahan Hasaranga";
        student1.ditno = "S001";
        student1.address = "40, A road, B city";

        student2.name = "Chanul Withanage";
        student2.ditno = "S002";
        student2.address = "37, Road road, City city";

        System.out.println(student1.name);
        System.out.println(student1.ditno);
        System.out.println(student1.address);

        System.out.println(student2.name);
        System.out.println(student2.ditno);
        System.out.println(student2.address);
    }
}
