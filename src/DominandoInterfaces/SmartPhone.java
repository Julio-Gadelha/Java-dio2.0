package DominandoInterfaces;

public class SmartPhone implements VideoPlayer, MusicPlayer {

    @Override
    public void playerMusic() {
        System.out.println(" O SmartPhone está Tocando a musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println(" O SmartPhone está Pausando a musica");
    }

    @Override
    public void stopMusic() {
        System.out.println(" O SmartPhone está   Parando a musica");
    }

    @Override
    public void playerVideo() {
        System.out.println(" O SmartPhone está   reproduzindo a video");
    }

    @Override
    public void pauseVideo() {
        System.out.println(" O SmartPhone está   Pausando a video");
    }

    @Override
    public void stopVideo() {
        System.out.println(" O SmartPhone está   Parando a video");
    }
}
