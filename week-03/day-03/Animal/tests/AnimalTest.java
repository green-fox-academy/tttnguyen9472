import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    Animal animal = new Animal();



    @Test(expected = NullPointerException.class)
    public void eatHungerNullTest() {
        animal.hunger = 1;
        animal.eat();
    }

    @Test(expected = NullPointerException.class)
    public void drinkThirstNullTest() {
        animal.thirst = 1;
        animal.drink();
    }

    @Test(expected = NullPointerException.class)
    public void playNegative() {
        animal.hunger = -1;
        animal.thirst = -1;
        animal.play();
    }

    @Test
    public void setHunger(){
        int expected = 20;
        int actual = (this.animal.hunger = 20);
        assertEquals(expected, actual);
    }

    @Test
    public void setThirst(){
        int expected = 10;
        int actual = (this.animal.thirst = 10);
        assertEquals(expected, actual);
    }
}