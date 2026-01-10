package Exercicio;

public class MeiaEntrada extends  Ticket{

    public MeiaEntrada(String nomeFilme, double valorIngresso, boolean dublado) {
        super(nomeFilme, valorIngresso, dublado);
    }

    public double getValorReal(){
        return  getValorIngresso() /2;
    }
}
