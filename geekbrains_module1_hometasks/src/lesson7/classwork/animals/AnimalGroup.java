package lesson7.classwork.animals;

public class AnimalGroup {
    private Animal[] animals;
    private AnimalCounter counter;

    public AnimalGroup() {
        this.animals = new Animal[0];
        this.counter = new AnimalCounter();
    }

    public AnimalCounter getCounter() {
        return counter;
    }

    public void add(Animal animal) {
        Animal[] extendedAnimals = new Animal[animals.length + 1];
        for (int i = 0; i < animals.length; i++) {
            extendedAnimals[i] = animals[i];
        }

        extendedAnimals[extendedAnimals.length - 1] = animal;

        animals = extendedAnimals;

        counter.increase(animal);
    }
}
