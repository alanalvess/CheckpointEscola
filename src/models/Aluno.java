package models;

public class Aluno extends Usuario{

    private int matricula;

    public Aluno(String nome, String cpf, String sexo, String telefone, String email, Endereco endereco){
        super(nome, cpf, sexo, telefone, email, endereco);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
