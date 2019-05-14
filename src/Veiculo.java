
public class Veiculo {

    private Pessoa proprietario;
    private Data dataAquisicao;
    private String finalidade;

    public void setProprietario(Pessoa p) {
        this.proprietario = p;
    }

    public void setDataAquisicao(Data dt) {
        this.dataAquisicao = dt;
    }

    public boolean informarFinalidade(String f) {

        String a = "passeio";
        String b = "diplomacia";
        String c = "aluguel";
        if (f.equals(a) || f.equals(b) || f.equals(c)) {
            this.finalidade = f;
            return true;
        } else {
            this.finalidade = "Nao se enquadra nos padroes exigidos. ";
            return false;
        }

    }

    public Pessoa getProprietario() {
        return this.proprietario;
    }

    public Data getDataAquisicao() {
        return this.dataAquisicao;
    }

    public String getFinalidade() {
        return this.finalidade;
    }

    public void mostrar() {
        System.out.println("Proprietario do veiculo: ");
        getProprietario().mostrar();
        System.out.print("Data de aquisicao: ");
        getDataAquisicao().mostrar();
        System.out.println("Finalidade: " + getFinalidade());

    }
}
