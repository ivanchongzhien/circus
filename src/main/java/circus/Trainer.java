package circus;

import circus.animals.Animal;
import circus.animals.Bird;
import circus.animals.Duck;
import circus.animals.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting - redundant
        getToSpeak(b);

        Animal a = b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // down casting
        train(new Duck());
        train(new Parrot());

    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
