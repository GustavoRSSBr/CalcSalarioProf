package br.com.gustavorssbr.calcularsalarioprofessor.model;

public class ProfessorTitular extends Professor{
    private int anosInstituicao;
    private double salario;

    public ProfessorTitular(String nome, String matricula, int idade, double salario, int anosInstituicao) {
        super(nome, matricula, idade);
        this.salario = salario;
        this.anosInstituicao = anosInstituicao;
    }

    @Override
    public double calcSalario() {
        int aumentos = anosInstituicao / 5;

        double aumentoTotal = aumentos * 0.05;

        return salario + (salario * aumentoTotal);
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
