package lesson7.classwork.animals;

public class AnimalCounter {
    private int total;
    private int cats;
    private int dogs;
    private int lions;

    public int getTotal() {
        return total;
    }

    public int getCats() {
        return cats;
    }

    public int getDogs() {
        return dogs;
    }

    public int getLions() {
        return lions;
    }

    void increase(Animal animal) {
        total++;

        if(animal instanceof Cat) {
            cats++;
        } else if(animal instanceof Dog) {
            dogs++;
        } else if (animal instanceof Lion) {
            lions++;
        }
    }
}
