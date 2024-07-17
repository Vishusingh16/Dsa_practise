package Oops;

class shape {
    public void area() {
        System.out.println("The Area Of Shape");
    }
}

class Circle extends shape {// single inheritance
    public void area(int r) {
        System.out.println("The Area Of Circle Is ");

    }
}

class semicircle extends Circle {// multilevel inheritance
    public void area(int h) {
        System.out.println("The Area Of Semicircle Is ");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        semicircle s = new semicircle();
        s.area(10);
        s.area(20);

    }

}
