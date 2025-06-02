public class Professor extends Usuario{

    private Double valorHora;
    private Formacao formacao;

    public Professor(String nome, String cpf, String sexo, String telefone, String email, Endereco endereco){
        super(nome, cpf, sexo, telefone, email, endereco);
        this.valorHora = valorHora;
        this.formacao = formacao;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }
}
