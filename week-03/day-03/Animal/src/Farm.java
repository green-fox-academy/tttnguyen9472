import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Farm {

//    Reuse your Animal class
//    Create a Farm class
//      it has list of Animals
//      it has slots which defines the number of free places for animals
//      breed() -> creates a new animal if there's place for it
//      slaughter() -> removes the least hungry animal

    List<Animal> animals = new ArrayList<>();
    int slots = 10;

    public void breed(Animal animal) {
        if (slots > 0) {
            animals.add(new Animal());
            slots--;
        }
    }

    public void slaughter() {
        int leastHungry = Integer.MAX_VALUE;
        int removeFromList = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).hunger < leastHungry) {
                leastHungry = animals.get(i).hunger;
                removeFromList = i;
            }
        }
        animals.remove(removeFromList);
    }
}
