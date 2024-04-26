public class BolsaPicanha extends Pessoa{
    private String endereco;
    private String telefone;

    public BolsaPicanha (){}

    public BolsaPicanha(String nome, int rg, String email, String endereco, String telefone) {
        super(nome, rg, email);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return super.toString() + " Endereço: " + endereco +
                " Telefone:" + " ( " + telefone + " ) \n";
    }
}
