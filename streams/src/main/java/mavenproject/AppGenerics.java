package mavenproject;

public class AppGenerics {

    public static void main(String[] args) {

        Box<Person> a  = new Box<>(new Person("mario", "rossi"));

        System.out.println(a.getElement());
        System.out.println(AppGenerics.<Integer>somma(10, 20));
        System.out.println(AppGenerics.<Double>somma(10.60, 20.30));
    }

    private static <T extends Number> double somma(T n1, T n2) {
        return n1.doubleValue() + n2.doubleValue();

    }
}

    class Box<E> {
        private E element;

        public Box(E element) {
            this.element = element;
        }

        public E getElement() {
            return element;
        }
    }
    record Person(String fname, String lname) {
    }