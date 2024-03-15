package oo_ExRectangle;

public class Rectangle {

    private final int b;
    private final int h;

    public Rectangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    public int getB() { // Leggo il valore della Base
        return b;
    }

    public int getH() { // Leggo il valore dell'altezza
        return h;
    }

    public int area() {// per calcolare l'Area
        return b * h;
    }

    public int perimeter() { // per calcolare il Perimetro
        return 2 * (b + h);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + b;
        result = prime * result + h;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangle other = (Rectangle) obj;
        if (b != other.b)
            return false;
        if (h != other.h)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Rectangle [B=" + b + ", h=" + h + "]";
    }
}
