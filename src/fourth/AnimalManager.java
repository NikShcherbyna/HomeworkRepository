package fourth;

public class AnimalManager {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Ceasar");
        dog1.swim(7);
        Animal dog2 = new Dog("Archi");
        dog2.run(350);
        Animal dog3 = new Dog("Roy");
        dog3.swim(13);
        Animal dog4 = new Dog("Spike");
        dog4.run(750);
        Dog.getCountOfAnimals();

        Animal cat1 = new Cat("Barsik");
        cat1.swim(12);
        Animal cat2 = new Cat("Bonapart");
        cat2.run(130);
        Animal cat3 = new Cat("Mushka");
        cat3.run(300);
        Cat.getCountOfAnimals();
    }
}