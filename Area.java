package Oops;

class shape {

    public void area() {
        System.out.println("Area of shape");
    }

}

class traingle extends shape {
    public void area(int length, int breadth) {
        System.out.println(1 / 2 * length * breadth);
    }

}

class circle extends shape {
    public void area(int radius) {
        System.out.println(3.14 * radius * radius);
    }
}

public class Area {

    public static void main(String[] args) {
        traingle t = new traingle();
        t.area(10, 20);
        circle c = new circle();
        c.area(23);

    }

}
