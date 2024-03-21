package exShape;

class Circle extends Shape{
    private double r;
    private final static double PI = 3.14;
    
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return r * r * PI;
        
    }

    @Override
    public double calculatePerimeter() {
        return 2 * r * PI;
        
    }

    

}
