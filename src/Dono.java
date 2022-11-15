public class Dono {
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;

    private static int id;
    public Dono(String nome, String cpf, String email, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Dono.id = ++id;
    }

    @Override
    public String toString() {
        return  " \n NOME: " + nome +
                " \n CPF: " + cpf +
                " \n EMAIL: " + email;
    }
}
