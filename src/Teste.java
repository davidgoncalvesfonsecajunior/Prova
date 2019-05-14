
public class Teste {
 public static void main(String[] args){
    //pessoa
    Pessoa p = new Pessoa();
    p.setNome("David");
    Data d1 = new Data();
    d1.setDia(10);
    d1.setMes(8);
    d1.setAno(1994);
    p.setDataDeNascimento(d1);
    //veiculo
    Veiculo v = new Veiculo();
    v.setProprietario(p);
    Data d2 = new Data();
    d2.setDia(13);
    d2.setMes(5);
    d2.setAno(2019);
    v.setDataAquisicao(d2);
    //mostrar
    p.mostrar();
    //inf
    v.informarFinalidade("passe");
    v.mostrar();
    }   
}
