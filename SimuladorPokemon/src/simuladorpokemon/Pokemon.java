package simuladorpokemon;

public class Pokemon {

    //ATRIBUTOS
    private String nome;
    private String tipo;
    private int level;
    private int vida;
    private int ataque;
    private int defesa;

    //CONSTRUTOR
    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        calcAtributos();
        calcBonus();
        imprimePokemon();

    }

    //METODOS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void imprimePokemon() {
        System.out.println("Nome: " + nome + " | "
                + "Tipo: " + tipo + " | "
                + "Level: " + level + " | "
                + "Vida: " + vida + " | "
                + "Ataque: " + ataque + " | "
                + "Defesa: " + defesa + " | ");

    }

    public void calcAtributos() {
        switch (this.tipo) {
            case "fogo":
                this.vida = (int) (50 * 0.50);
                this.ataque = (int) (50 * 2);
                this.defesa = (int) (50 * 1);
                break;

            case "agua":
                this.vida = (int) (50 * 1);
                this.ataque = (int) (50 * 0.75);
                this.defesa = (int) (50 * 1.50);
                break;

            case "planta":
                this.vida = (int) (50 * 1);
                this.ataque = (int) (50 * 0.50);
                this.defesa = (int) (50 * 2);
                break;
        }

    }

    public void calcBonus() {
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (defesa / 4);
    }

   
    

}
