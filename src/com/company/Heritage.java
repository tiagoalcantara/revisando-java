package com.company;


class DomesticAnimal {
    private final String name;

    public DomesticAnimal(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(name + " andou um pouco.");
    }

    public void eat() {
        System.out.println(name + " comeu alguma coisa.");
    }

    public void sleep() {
        System.out.println(name + " dormiu.");
    }

    public String getName() {
        return name;
    }
}

class Dog extends DomesticAnimal{
    public Dog(String name){
        super(name);
    }

    public void bark() {
        System.out.println(super.getName() + " diz: woof");
    }
}

class Cat extends DomesticAnimal{
    public Cat(String name){
        super(name);
    }

    public void meow() {
        System.out.println(super.getName() + " diz: meaw");
    }
}



public class Heritage {
    public static void main(String[] args) {
        Dog toby = new Dog("Toby");
        toby.eat();
        toby.bark();

        Cat leia = new Cat("Leia");
        leia.meow();
        leia.sleep();
    }
}
