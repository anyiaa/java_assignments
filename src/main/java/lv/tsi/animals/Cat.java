package lv.tsi.animals;

public class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

/*
public class Cat implements Domestic {
    private String name;

    Cat(String Minny) {
        this.name = Minny;
    }

    @Override
    public void printName() {
        System.out.println("Cat’s name is " + this.name);
    }
}
*/
