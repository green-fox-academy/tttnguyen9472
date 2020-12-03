import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.
        // Certain types are effective against others, e.g. water is effective against fire.

        // Ash has a few pokemon.
        // A wild pokemon appeared!

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");
        List<String> chosenPokemon = new ArrayList<>();
        for (Pokemon choosePokemon : pokemonOfAsh){
          if (choosePokemon.isEffectiveAgainst(wildPokemon) == true){
              chosenPokemon.add(choosePokemon.name);
          }   else {
              continue;
          }
        }


        // Which pokemon should Ash use?

        System.out.print("I choose you, " + chosenPokemon.get((int)Math.random() * chosenPokemon.size()));




    }
    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Bulbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Bulbasaur", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }
}
