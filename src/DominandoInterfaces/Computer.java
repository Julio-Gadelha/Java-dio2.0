package DominandoInterfaces;

public class Computer implements VideoPlayer, MusicPlayer {

    @Override
    public void playerMusic() {
        System.out.println(" O Computador está Tocando a musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println(" O Computador está Pausando a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println(" O Computador está   Parando a musica");
    }

    @Override
    public void playerVideo() {
        System.out.println(" O Computador está   reproduzindo a video");
    }

    @Override
    public void pauseVideo() {
        System.out.println(" O Computador está   Pausando a video");
    }

    @Override
    public void stopVideo() {
        System.out.println(" O Computador está   Parando a video");
    }
}


