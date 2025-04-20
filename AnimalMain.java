
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    void display() {
        System.out.println("Dog Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    void display() {
        System.out.println("Cat Name: " + name + ", Age: " + age);
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Dog d = new Dog("Rex", 5);
        Cat c = new Cat("Whiskers", 3);

        d.display();
        c.display();
    }
}
