package oo_ExRectangle;

public class AppRectangle {
 
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(7, 10);

        System.out.println(rectangle.toString());
        System.out.println("L'Area del rettangolo è: " + rectangle.getArea());
        System.out.println("Il Perimetro del rettangolo è: " + rectangle.getPerimeter());
    }
}
