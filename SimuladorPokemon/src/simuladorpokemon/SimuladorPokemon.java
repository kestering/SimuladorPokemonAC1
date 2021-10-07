package simuladorpokemon;

public class SimuladorPokemon {

    public static void main(String[] args) {
        int vidaPok1;
        int ataquePok1;
        int defesaPok1;
        int vidaPok2;
        int ataquePok2;
        int defesaPok2;
        
        //instancia um objeto do tipo pokemon
        Pokemon pok1 = new Pokemon("Chikorita", "planta", 12);
        Pokemon pok2 = new Pokemon("Totodile", "agua", 10);

        //variaveis que armazena a vida dos pokemons
        vidaPok1 = pok1.getVida();
        ataquePok1 = pok1.getAtaque();
        defesaPok1 = pok1.getDefesa();
        vidaPok2 = pok2.getVida();
        ataquePok2 = pok2.getAtaque();
        defesaPok2 = pok2.getDefesa();

        //Batalha Pokemon
        if ((vidaPok1 + ataquePok1 + defesaPok1) > (vidaPok2 + ataquePok2 + defesaPok2)) {
            System.out.println(pok1.getNome() + " Venceu");
        } else {
            System.out.println(pok2.getNome() + " Venceu");
        }

    }

}
