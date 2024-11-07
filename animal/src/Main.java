interface Animal {

    void sound();

    default void sleep() {

        System.out.printf("zwierze idzie spac");

    }

    static void endOfDay() {

        System.out.println("dzien sie skonczyl, zwierzeta ida spac");

    }

    default void eat(){
        System.out.println("zwierze zaczyna jeść");
    }

}

class Dog implements Animal {
    public void sound() {

        System.out.println("woof woof");

    }

}

class Cat implements Animal {
    public void sound() {

        System.out.println("meow meow");

    }

}

class Bird implements Animal {
    public void sound() {
        System.out.println("tweet tweet");
    }
}

class Cow implements Animal {
    public void sound() {
        System.out.println("MUUUUUUUUUUUUU");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        dog.sound();
        dog.sleep();
        dog.eat();

        Animal cat = new Cat();
        cat.sound();
        cat.sleep();
        cat.eat();

        Animal bird = new Bird();
        bird.sound();
        bird.sleep();
        bird.eat();

        Animal cow = new Cow();
        cow.sound();
        cow.sleep();
        cow.eat();

    }

}