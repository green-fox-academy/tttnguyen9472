import java.util.ArrayList;
import java.util.List;

public class Animal {
//    Create an Animal class
//
//    Every animal has a hunger value, which is a whole number
//      Every animal has a thirst value, which is a whole number
//      when creating a new animal object these values are created with the default 50 value
//      Every animal can eat() which decreases their hunger by one
//      Every animal can drink() which decreases their thirst by one
//      Every animal can play() which increases both by one

    int hunger = 50;
    int thirst = 50;


    public void eat(){
        hunger = hunger - 1;
    }

    public void drink(){
        thirst = thirst - 1;
    }

    public void play(){
        hunger = hunger + 1;
        thirst = thirst + 1;
    }


    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();
        System.out.println(animal1.hunger);
        System.out.println(animal1.thirst);

        Animal animal2 = new Animal();
        animal2.drink();
        System.out.println(animal2.hunger);
        System.out.println(animal2.thirst);

        Animal animal3 = new Animal();
        animal3.play();
        System.out.println(animal3.hunger);
        System.out.println(animal3.thirst);

        Farm farm1 = new Farm();
        farm1.breed(animal1);
        farm1.breed(animal2);
        farm1.breed(animal3);
        System.out.println(farm1.slots);

        farm1.slaughter();
        System.out.println(farm1.slots);


    }
}
