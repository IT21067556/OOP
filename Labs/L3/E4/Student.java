class Student {
    private String name, ditno, address;

    Student(String name, String ditno, String address) {
        this.name = name;
        this.ditno = ditno;
        this.address = address;
    }

    void setName(String name) {
        this.name = name;
    }

    void setDit(String ditno) {
        this.ditno = ditno;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getName() {
        return this.name;
    }

    String getDit() {
        return this.ditno;
    }

    String getAddress() {
        return this.address;
    }

    String getDetails() {
        return "I am a Student.\nMy name is " + name + ".\nI am from " +
            address + ".\nMy dit no is " + ditno;
    }
}
