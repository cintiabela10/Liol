package br.com.liol.entities;

import java.time.LocalDate;

import br.com.liol.entities.enums.Objetivo;
import br.com.liol.entities.enums.StatusMatricula;
import br.com.liol.entities.enums.TipoPlano;

public class Aluno extends Pessoa {

    private String matriculaAluno;
    private LocalDate dataInscricao;

    private double altura;
    private double peso;

    private StatusMatricula matricula;
    private Objetivo objetivo;
    private TipoPlano tipoPlano;

    public Aluno() {
        super();
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public LocalDate getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(LocalDate dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public StatusMatricula getMatricula() {
        return matricula;
    }

    public void setMatricula(StatusMatricula matricula) {
        this.matricula = matricula;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public TipoPlano getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(TipoPlano tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    @Override
    public String toString() {
        return getNomeCompleto();
    }
}