package lv.tsi.animals;

public class Animals {
    public static void main(String[] args){
        Fox fox = new Fox();
        Cat cat = new Cat();
        Dog dog = new Dog();

        fox.sound();
        cat.sound();
        dog.sound();
    }
}
