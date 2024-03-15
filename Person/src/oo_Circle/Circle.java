package oo_Circle;

public class Circle {

    private double r;
    private final static double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double area(){      
        return r * r * PI;
    }
    
    public double circumference(){        
        return 2 * r * PI;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(r);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Circle other = (Circle) obj;
        if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Circle [r=" + r + "]";
    }

}
