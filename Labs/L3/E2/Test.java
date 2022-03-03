class Test {
    public static void main(String args[]) {
        Student student1 = new Student("Sahan Hasaranga",
                                       "S001",
                                       "40, A road, B city");
        Student student2 = new Student("Chanul Withanage",
                                       "S002",
                                       "37, Road road, City city");

        System.out.println(student1.name);
        System.out.println(student1.ditno);
        System.out.println(student1.address);

        System.out.println(student2.name);
        System.out.println(student2.ditno);
        System.out.println(student2.address);
    }
}
