package lv.tsi.animals;

public class Fox implements Animal {
    public void sound(){
        System.out.println("Wa-pow");
    }
}

/*
public class Fox implements Wild {
    private int age;

    Fox(int age) {
        this.age = 2;
    }

    @Override
    public void age() {
        System.out.println("Fox's age is " + this.age);
    }
}
*/
