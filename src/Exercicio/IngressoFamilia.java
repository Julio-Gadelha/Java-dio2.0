package Exercicio;

public class IngressoFamilia extends  Ticket {
    private int quantidadePessoas;

    public IngressoFamilia(String nomeFilme, double valorIngresso, boolean dublado, int quantidadePessoas) {
        super(nomeFilme, valorIngresso, dublado);
        this.quantidadePessoas = quantidadePessoas;
    }

    public double  getValorReal(){

        double total = getValorIngresso() * quantidadePessoas;

        if(quantidadePessoas >3){
            total *= 0.50;
        }
        return  total;

    }
}
