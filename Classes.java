package Oops;

class students {
    String name;
    int age;
    String address;

    public void getInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);

    }
}

public class Classes {
    public static void main(String[] args) {
        students s1 = new students();// constuctor
        s1.name = "vaishnav";
        s1.age = 20;
        s1.address = "pune";
        s1.getInfo();

        students s2 = new students();
        s2.name = "vishu";
        s2.age = 21;
        s2.address = "delhi";
        s2.getInfo();

    }

}
