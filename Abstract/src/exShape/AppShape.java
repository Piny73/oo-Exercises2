package exShape;

public class AppShape {
    public static void main(String[] args) {
        double r = 5.0;
        Circle circle = new Circle(r);
		double l1 = 5.0, l2 = 5.0, l3 = 7.0;
        Triangle triangle = new Triangle(l1, l2, l3);
        System.out.println("Il raggio del cerchio è: " + r + ";");
        System.out.println("L'area del cerchio è: " + circle.calculateArea() + ";");
        System.out.println("La circonferenza del cerchio è: " + circle.calculatePerimeter() + ".");
        System.out.println("I lati del triangolo sono: " + "l1= " + l1 + " l2= " + l2 + " l3= " + l3 + ";");
        System.out.println("L'area del triangolo è: " + triangle.calculateArea() + ";");
        System.out.println("Il perimetro del triangolo è: " + triangle.calculatePerimeter() + ".");

    }
}
