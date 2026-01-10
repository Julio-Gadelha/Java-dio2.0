package Exercicio;

public class Cinema {
    public static void main(String[] args) {

        Ticket ticket = new Ticket("Aventura", 40,true);
        MeiaEntrada meia = new MeiaEntrada("Fenix", 90,false);
        IngressoFamilia ingressoFamilia = new IngressoFamilia("orta",948,true,7);

        System.out.println("Ingresso normal : " + ingressoFamilia.getValorReal());
        System.out.println("Meia entrada: R$ " + meia.getValorReal());
        System.out.println("Ingresso família: R$ " + ingressoFamilia.getValorReal());

    }
}
