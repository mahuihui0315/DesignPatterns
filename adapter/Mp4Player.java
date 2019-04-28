package AdapterPattern;

/**
 * Mp4播放器实体类
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 fileName:  "+fileName);
    }
}
