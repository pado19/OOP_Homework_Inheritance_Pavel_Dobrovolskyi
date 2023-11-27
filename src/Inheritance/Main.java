package Inheritance;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setRunDistance(200);
        cat.setSwimDistance(0);
        System.out.println("Cat ran " + cat.getRunDistance());
            if (cat.getSwimDistance() == 0) {
                System.out.println("Cat can't swim");
            } else {
                System.out.println("Cat swam " + cat.getSwimDistance());
            }
        System.out.println("Total cats: " + Cat.count);

        Dog dog = new Dog();
        dog.setRunDistance(500);
        dog.setSwimDistance(10);
        System.out.println("\nDog ran " + dog.getRunDistance());
        System.out.println("Dog swam " + dog.getSwimDistance());
        System.out.println("Total cats: " + Dog.count);

        System.out.println("\nTotal animals: " + Animals.count);

    }
}
