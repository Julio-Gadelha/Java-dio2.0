package Exercicio;

public class Ticket {

    private String nomeFilme;
    private double valorIngresso;
    private boolean dublado;

    public Ticket(String nomeFilme, double valorIngresso, boolean dublado) {
        this.nomeFilme = nomeFilme;
        this.valorIngresso = valorIngresso;
        this.dublado = dublado;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public boolean isDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }
}
