public class BolsaFamilia extends Pessoa{

    private int rendaFamiliar;
    public BolsaFamilia(){}

    public BolsaFamilia(String nome, int rg, String email, int rendaFamiliar){
        super(nome, rg, email);
        this.rendaFamiliar = rendaFamiliar;
    }

    public int getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(int rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }

    @Override
    public String toString() {
        return super.toString() + " Renda Familiar: \n" + rendaFamiliar;
    }
}

