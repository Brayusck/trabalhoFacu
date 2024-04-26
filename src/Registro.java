import java.util.ArrayList;
import java.util.List;

public class Registro {
private static List<Pessoa> listaPessoas = new ArrayList<>();
    public static void registrar(Pessoa pessoa){
        listaPessoas.add(pessoa);
    }
        public static List<Pessoa> getListaPessoas(){
        return listaPessoas;
        }

    public static void setListaPessoas(List<Pessoa> listaPessoas) {
        Registro.listaPessoas = listaPessoas;
    }
    public static Pessoa buscarPessoa(int rg){
        for (Pessoa p : listaPessoas) {
            if(p.getRg() == rg){
                return p;
            }
        }
             return null;
    }
    public static boolean apagarPessoa(int rg){
        Pessoa pessoa = buscarPessoa(rg);
        if(pessoa != null){
            listaPessoas.remove(pessoa);
            return true;
        }
             return false;
    }
    public static Pessoa removerPessoa(int rg){
        Pessoa pessoaRemovida = null;
        for (Pessoa p : listaPessoas) {
            if(p.getRg() == rg){
                pessoaRemovida = p;
                listaPessoas.remove(p);
                break;
            }
        }
        return pessoaRemovida;
    }
}
