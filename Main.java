public class Main {
    public static void main(String[] args) {
Animal dog = new Dog();
Animal cat = new Cat();

        System.out.println("dog");
        dog.eat();
        dog.makeSound();
        dog.sleep();

        System.out.println("cat");
        cat.sleep();
        cat.makeSound();
        cat.eat();
    }
}