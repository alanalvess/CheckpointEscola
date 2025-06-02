package models;

import enums.Turno;

public abstract class Curso {

    private String nomeCurso;
    private Double valorCurso;
    private Turno turno;

    public Curso(String nomeCurso, Double valorCurso, Turno turno) {
        this.nomeCurso = nomeCurso;
        this.valorCurso = valorCurso;
        this.turno = turno;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Double getValorCurso() {
        return valorCurso;
    }

    public void setValorCurso(Double valorCurso) {
        this.valorCurso = valorCurso;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public void matrucularAluno(Aluno aluno){};

    public void cadastrarProfessor(Professor professor){};

    public void definirSala(Sala sala){};

    public void definirTurno(Turno turno){};
}
