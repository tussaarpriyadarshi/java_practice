abstract class Animal{
    abstract  void makeSound();

    

}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("bhaw bhaw");
    }

}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("meow meow");
    }

}
public class animalsound{
    public static void main(String[] args){
        Animal p=new Dog();
        Animal q=new Cat();
        p.makeSound();
        q.makeSound();

    }
}
