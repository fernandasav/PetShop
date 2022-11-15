public class Animal {
    private TipoAnimal tipoAnimal;
    private String nome;
    private int idade;
    private boolean estaDoente;
    private Dono dono;
    private static int id;

    public Animal(TipoAnimal tipoAnimal, String nome, int idade, boolean estaDoente, Dono dono, int id) {
        this.tipoAnimal = tipoAnimal;
        this.nome = nome;
        this.idade = idade;
        this.estaDoente = estaDoente;
        this.dono = dono;
        this.id = id;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if ((idade > 0) && (idade < 20)) {
            this.idade = idade;
        } else {
            System.out.println("Idade não pode ser menor que 0 ou maior que 20.");
        }
    }

    public boolean isEstaDoente() {
        return estaDoente;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        Animal.id = id;
    }

    @Override
    public String toString() {
        return "INFORMAÇÕES DO ANIMAL: " +
                "\n TIPO: " + tipoAnimal +
                "\n NOME: " + nome +
                "\n IDADE: " + idade + " anos" +
                "\n ESTÁ DONTE? " + estaDoente +
                "\n * DADOS DO DONO: * " + getDono() +
                "\n * ENDEREÇO: * " + dono.getEndereco() +
                "\n * COMPLEMENTOS: * " +
                "\n ID: " + id;
    }
}



