package oo_Circle;

public class Circle {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getAreaC(){
        double pi = 3.14;
        double AC = r * r * pi;
        return AC;
    }
    
    public double getCircumference(){
        double pi = 3.14;
        double C = 2 * r * pi;
        return C;
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
