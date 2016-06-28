package dayTwo.ClassificationOfAnimals;

import java.util.ArrayList;
import java.util.Collection;
import static dayTwo.ClassificationOfAnimals.AnimalCreation.*;

/**
 * Created by student on 28-Jun-16.
 */
public class Programme {
    public static void main (String[] args){
        Collection<Mamals> mamalses = new ArrayList<>();
        Collection<Reptile> reptiles = new ArrayList<>();
        Collection<Insects> insectses = new ArrayList<>();

        mamalses.add(human);
        mamalses.add(shark);
        mamalses.add(dog);

        reptiles.add(snake);
        reptiles.add(gecko);
        reptiles.add(frog);

        insectses.add(bee);
        insectses.add(spider);
        insectses.add(ladyBird);

        for (Animal a: mamalses)
        {
            System.out.println(a);
        }

    }
}
