class Test {
    public static void main(String args[]) {
        Student student1 = new Student("Sahan Hasaranga",
                                       "S001",
                                       "40, A road, B city");
        Student student2 = new Student("Chanul Withanage",
                                       "S002",
                                       "37, Road road, City city");

        System.out.println(student1.getName());
        System.out.println(student1.getDit());
        System.out.println(student1.getAddress());

        System.out.println(student2.getName());
        System.out.println(student2.getDit());
        System.out.println(student2.getAddress());
    }
}
