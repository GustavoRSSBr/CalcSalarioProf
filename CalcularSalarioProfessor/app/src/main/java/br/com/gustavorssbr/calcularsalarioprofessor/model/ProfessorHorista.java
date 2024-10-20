package br.com.gustavorssbr.calcularsalarioprofessor.model;

public class ProfessorHorista extends Professor{
    private int horasAula;
    private double valorHora;

    public ProfessorHorista(String nome, String matricula, int idade, int horasAula, double valorHora) {
        super(nome, matricula, idade);
        this.horasAula = horasAula;
        this.valorHora = valorHora;
    }

    @Override
    public double calcSalario() {
        return horasAula * valorHora;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
