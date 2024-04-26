public class Pessoa {
    private String nome;
    private int rg;
    private String email;
public Pessoa(){}
    public Pessoa(String nome, int rg, String email) {
        this.nome = nome;
        this.rg = rg;
        this.email = email;
    }

        // Getters e Setter;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

        // Getters e Setter;
    public int getRg() {
        return rg;
    }
    public void setRg(int rg) {
        this.rg = rg;
    }

        // Getters e Setter;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
            return super.toString() +   "\nNome: " + nome +
                                        "\nRG: " + rg +
                                        "\nEmail: " + email;
    }
}
