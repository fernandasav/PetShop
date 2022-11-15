import java.sql.SQLOutput;

public class Cachorro extends Animal{

    private CachorroRaca cachorroRaca;

    public Cachorro(TipoAnimal tipoAnimal,String nome, int idade, boolean estaDoente, Dono dono, int id, CachorroRaca cachorroRaca) {
        super(tipoAnimal, nome, idade, estaDoente, dono, id);
        this.cachorroRaca = cachorroRaca;
    }

    public CachorroRaca getCachorroRaca() {
        return cachorroRaca;
    }

    public void setCachorroRaca(CachorroRaca cachorroRaca) {
        this.cachorroRaca = cachorroRaca;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n RAÇA DO CACHORRO: " + cachorroRaca + "\n";
    }
}


