package br.com.liol.entities;
import br.com.liol.entities.enums.StatusMatricula;
import br.com.liol.entities.enums.Objetivo;
import br.com.liol.entities.enums.TipoPlano;

public class Aluno {

    private String nome;
    private String cpf;
    private String dataNascimento; // dd/mm/aa
    private String telefone;       // (11) 9 1234-4321
    private double peso;           // Kg
    private double altura;         // metros
    private String email;
    private StatusMatricula matricula;  // Ativa, Expirada ou Cancelada
    private Objetivo objetivo;     // Emagrecimento, Hipertrofia ou Condicionamento
    private TipoPlano tipoPlano;   // Mensal, Trimestral, Semestral ou Anual - conforme os dados mockup de planos

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String dataNascimento,
            String telefone, double peso, double altura,
            String email, StatusMatricula matricula,
            Objetivo objetivo, TipoPlano tipoPlano) {

   this.nome = nome;
   this.cpf = cpf;
   this.dataNascimento = dataNascimento;
   this.telefone = telefone;
   this.peso = peso;
   this.altura = altura;
   this.email = email;
   this.matricula = matricula;
   this.objetivo = objetivo;
   this.tipoPlano = tipoPlano;
}

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return nome;
    }
}