package AdapterPattern;

/**
 * Vlc播放器实体类
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing Vlc fileName: "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
