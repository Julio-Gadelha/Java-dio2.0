package DominandoInterfaces;

public class MusicBox  implements  MusicPlayer {

    @Override
    public void playerMusic() {
        System.out.println("  A caixa de musica está Tocando a musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("  A caixa de musica está Pausando a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("  A caixa de musica está   Parando a musica");
    }


}
