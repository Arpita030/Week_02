package AssistedProblem;
class Animal {
    String name;
    int age;

    void setDetail(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void getDetail() {
        System.out.println("Animal name is " + name);
        System.out.println("Animal age is " + age);

    }

    void makeSound() {
        System.out.println("Animal makes sound");
    }

}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("birds chirping");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Animal cat = new Cat();
        cat.setDetail("billu", 3);
        cat.getDetail();
        cat.makeSound();

        Dog dog = new Dog();
        dog.setDetail("Sundariii", 3);
        dog.getDetail();
        dog.makeSound();

        Bird bird = new Bird();
        bird.setDetail("Tweety", 1);
        bird.getDetail();
        bird.makeSound();
    }

}
