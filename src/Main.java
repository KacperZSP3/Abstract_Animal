// Klasa abstrakcyjna, która reprezentuje ogólne cechy zwierzęcia
abstract class Animal {
    // Właściwość określająca nazwę zwierzęcia
    private String name;

    // Konstruktor, który ustawia nazwę zwierzęcia
    public Animal(String name) {
        this.name = name;
    }

    // Metoda, która zwraca nazwę zwierzęcia
    public String getName() {
        return name;
    }

    // Metoda, która zwraca ogólny opis zwierzęcia
    public void describe() {
        System.out.println("Jestem zwierzęciem o imieniu " + name);
    }

    // Metoda abstrakcyjna, którą muszą zdefiniować klasy dziedziczące.
    // Reprezentuje unikalny dźwięk, jaki wydaje zwierzę.
    abstract public void makeSound();

    public void eat() {
        System.out.println("Spożywam posiłek!");
    }
}

class Dog extends Animal {
    // Konstruktor klasy Dog, wywołujący konstruktor klasy nadrzędnej Animal
    public Dog(String name) {
        super(name); // Przekazanie nazwy do klasy nadrzędnej
    }

    // Implementacja metody abstrakcyjnej makeSound
    @Override
    public void makeSound() {
        System.out.println("Hau hau!");
    }

}

class Cat extends Animal {
    // Konstruktor klasy Dog, wywołujący konstruktor klasy nadrzędnej Animal
    public Cat(String name) {
        super(name); // Przekazanie nazwy do klasy nadrzędnej
    }

    // Implementacja metody abstrakcyjnej makeSound
    @Override
    public void makeSound() {
        System.out.println("Miau!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " spożywa posiłek!");
    }
}

class Application {
    public static void main(String[] args) {
        // Tworzymy obiekt klasy Dog
        Dog dog = new Dog("Azor");
        Cat cat = new Cat("Pulpet");

        // Wywołujemy metody
        System.out.println("Nazwa zwierzęcia: " + dog.getName());
        dog.describe();
        dog.makeSound();
        dog.eat();

        System.out.println("Drugie zwierze: " + cat.getName());
        cat.describe();
        cat.makeSound();
        cat.eat();
    }
}