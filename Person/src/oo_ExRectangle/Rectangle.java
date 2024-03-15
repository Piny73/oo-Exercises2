package oo_ExRectangle;

public class Rectangle {

    private final int B;
    private final int h;

    public Rectangle(int b, int h) {
        B = b;
        this.h = h;
    }

    public int getB() { // Leggo il valore della Base
        return B;
    }

    public int getH() { // Leggo il valore dell'altezza
        return h;
    }

    public int getArea() {// per calcolare l'Area
        int A = B * h;
        return A;
    }

    public int getPerimeter() { // per calcolare il Perimetro
        int P = 2 * (B + h);
        return P;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + B;
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
        if (B != other.B)
            return false;
        if (h != other.h)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Rectangle [B=" + B + ", h=" + h + "]";
    }
}
