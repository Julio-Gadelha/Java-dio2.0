package Encapsulamento;

public class Carro {

    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.ligado = true;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado.");
            return;
        }

        if (velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("Carro desligado.");
        } else {
            System.out.println("Para desligar, o carro deve estar em ponto morto e parado.");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("Carro desligado.");
            return;
        }

        if (marcha == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }

        if (velocidade < 120 && podeAcelerar()) {
            velocidade++;
            System.out.println("Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("Limite de velocidade da marcha atingido.");
        }
    }

    public void diminuirVelocidade() {
        if (!ligado) {
            System.out.println("Carro desligado.");
            return;
        }

        if (velocidade > 0) {
            velocidade--;
            System.out.println("Velocidade: " + velocidade + " km/h");
        }
    }

    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("Carro desligado.");
            return;
        }

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida.");
            return;
        }

        if (Math.abs(novaMarcha - marcha) != 1) {
            System.out.println("Não é permitido pular marchas.");
            return;
        }

        marcha = novaMarcha;
        System.out.println("Marcha atual: " + marcha);
    }

    public void virarEsquerda() {
        if (podeVirar()) {
            System.out.println("Virando para a esquerda.");
        } else {
            System.out.println("Velocidade incompatível para virar.");
        }
    }

    public void virarDireita() {
        if (podeVirar()) {
            System.out.println("Virando para a direita.");
        } else {
            System.out.println("Velocidade incompatível para virar.");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    private boolean podeVirar() {
        return ligado && velocidade >= 1 && velocidade <= 40;
    }

    private boolean podeAcelerar() {
        return switch (marcha) {
            case 1 -> velocidade < 20;
            case 2 -> velocidade < 40;
            case 3 -> velocidade < 60;
            case 4 -> velocidade < 80;
            case 5 -> velocidade < 100;
            case 6 -> velocidade < 120;
            default -> false;
        };
    }
}
