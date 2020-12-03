import java.awt.*;
import java.util.Random;

public class Sharpie {
//    Create Sharpie class
//      We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
//    When creating one, we need to specify the color and the width
//    Every sharpie is created with a default 100 as inkAmount
//    We can use() the sharpie objects
//      which decreases inkAmount

    String color;
    double width;
    double inkAmount = 100;

    public Sharpie(String color, double width) {
        this.color = color;
        this.width = width;
    }

    public void use(double usedAmount) {
        this.inkAmount = this.inkAmount - usedAmount;
    }


    public static void main(String[] args) {

        Sharpie sharpie1 = new Sharpie("blue", 20);
        sharpie1.use(sharpie1.inkAmount);
        System.out.println(sharpie1.color);
        System.out.println(sharpie1.width);
        System.out.println(sharpie1.inkAmount);

        Sharpie sharpie2 = new Sharpie("green", 20);
        Sharpie sharpie3 = new Sharpie("red", 20);
        Sharpie sharpie4 = new Sharpie("black", 20);

        SharpieSet sharpieSet = new SharpieSet();

        sharpieSet.addSharpie(sharpie1);
        sharpieSet.addSharpie(sharpie2);
        sharpieSet.addSharpie(sharpie3);
        sharpieSet.addSharpie(sharpie4);

        Random random = new Random();

        for (int i = 0; i < 80; i++) {
            sharpieSet.sharpieSet.get(random.nextInt(9)).use(random.nextInt(20));
        }
        System.out.println(sharpieSet.sharpieSet.size());
        System.out.println(sharpieSet.countUsable());
        sharpieSet.removeTrash();
        System.out.println(sharpieSet.sharpieSet.size());

    }
}
