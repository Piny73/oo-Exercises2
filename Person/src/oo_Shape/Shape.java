package oo_Shape;

public class Shape {
    private final int b;
    private final int h;

    public Shape(int b, int h) {
        this.b = b;
        this.h = h;
    }

    public int getB() { // Leggo il valore della Base
        return b;
    }

    public int getH() { // Leggo il valore dell'altezza
        return h;
    }

    public int getArea() {// per calcolare l'Area
        return b * h;
    }

    @Override
    public String toString() {
        return "Shape [b=" + b + ", h=" + h + "]";
    }

}
