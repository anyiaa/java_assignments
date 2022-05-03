package lv.tsi.animals;

public class Dog implements Animal {
    public void sound(){
        System.out.println("Bark");
    }
}

/*
public class Dog implements Domestic {
    private String name;

    Dog(String Sharp) {
        this.name = Sharp;
    }

    @Override
    public void printName() {
        System.out.println("Dog’s name is " + this.name);
    }
}
*/
