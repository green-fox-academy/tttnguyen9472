import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
//    Create SharpieSet class
//      it contains a list of Sharpie
//      countUsable() -> sharpie is usable if it has ink in it
//      removeTrash() -> removes all unusable sharpies

    public ArrayList<Sharpie> sharpieSet;

    public void addSharpie(Sharpie sharpie){
        sharpieSet.add(sharpie);
    }

    public int countUsuable(){
        int usuable = 0;
        for (Sharpie sharpie : sharpieSet){
            if(sharpie.inkAmount > 0){
                usuable++;
            }
        }
        return usuable;
    }

    public void removeTrash(){
        for(int i = 0;i < sharpieSet.size(); i++){
            if(sharpieSet.get(i).inkAmount == 0){
                sharpieSet.remove(i);
            }
        }
    }




}
