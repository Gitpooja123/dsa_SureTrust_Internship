class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
// Child class
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }

    void fetchBall() {
        System.out.println("Dog is fetching the ball!");
    }
}
public class CastingExample {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.makeSound();

        Dog d = (Dog) a;
        d.fetchBall();

        Animal a2 = new Animal();
        if (a instanceof Dog) {
            Dog safeDog = (Dog) a;
            safeDog.fetchBall(); // Safe access
        }

        if (a2 instanceof Dog) {
            Dog d3 = (Dog) a2;
            d3.fetchBall();
        } else {
            System.out.println("Downcasting not allowed: a2 is not a Dog");
        }
    }
}
