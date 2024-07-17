package Oops;

class pen {
    String color;

    public void printInfo() {
        System.out.println("color is " + this.color);
    }
}

public class Classes2 {
    public static void main(String[] args) {// calling main function

        pen p1 = new pen();
        p1.color = "blue";
        pen p2 = new pen();
        p2.color = "red";
        pen p3 = new pen();
        p3.color = "black";

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
    }

}
