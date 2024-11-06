public class Cat implements Animal{
    public void eat(){
        System.out.println("the cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("the cat is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("the cat is meowing");
    }
}
