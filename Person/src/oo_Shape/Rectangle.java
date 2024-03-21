package oo_Shape;

public class Rectangle extends Shape {

    private int b;
    private int h;

    public Rectangle(int b, int h) {
        this.b = b;
        this.h = h;
    }
    @Override
    public int getArea() {
        return b*h;
    }   
}
