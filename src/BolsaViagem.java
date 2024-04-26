public class BolsaViagem  extends Pessoa{
    private String  faculdade;
    private String paisDesejado;
    public BolsaViagem(){}

        public BolsaViagem(String nome, int rg, String email, String faculdade, String paisDesejado){
        super(nome, rg, email);
        this.faculdade = faculdade;
        this.paisDesejado = paisDesejado;
        }
    //Getters e Setters
    public String getFaculdade() {
        return faculdade;
    }
    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }
        //Getters e Setters

    public String getPaisDesejado() {
        return paisDesejado;
    }
    public void setPaisDesejado(String paisDesejado) {
        this.paisDesejado = paisDesejado;
    }

    @Override
    public String toString() {
        return super.toString() + " Faculdade: " + faculdade
                + " Pais desejado: \n" + paisDesejado;
    }
}
