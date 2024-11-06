public class Dog implements Animal{
    public void eat(){
        System.out.println("the dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("the dog is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("the dog is woofing");
    }
}
