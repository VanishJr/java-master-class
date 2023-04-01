import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("shepard", "big", 100));
        animals.add(new Dog("wolf", "middle", 100));
        animals.add(new Fish("goldfish", "small", 10));
        animals.add(new Horse("clydesdale", "big", 1000));

        for (Animal animal : animals) {
            dogStuff(animal);
            if (animal instanceof Mammal currentMammal) {
                currentMammal.sheadHair();
            }
        }
    }

    public static void dogStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");

    }
}