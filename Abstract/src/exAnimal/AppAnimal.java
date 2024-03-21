package exAnimal;

public class AppAnimal {
    public static void main(String[] args) {
        Animal lion = new Lion();
        lion.sound(); // Output: Lion roars!

        Animal tiger = new Tiger();
        tiger.sound(); // Output: Tiger growls!
    }
}
