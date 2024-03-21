package oo_Shape;

public class AppShape {

        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(3, 10);
            int area = rectangle.getArea();
            System.out.println("L'Area del rettangolo è: " + area);
        }
}
