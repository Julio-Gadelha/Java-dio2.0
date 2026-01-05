package Encapsulamento;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.ligar();
        carro.trocarMarcha(1);
        carro.acelerar();
        carro.acelerar();
        carro.virarDireita();
        carro.verificarVelocidade();
    }
}
