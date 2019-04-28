package AdapterPattern;

import org.junit.Test;

public class AdapterTest {
    @Test
    public void adapterTest(){
        AudioPlayer audioPlayer=new AudioPlayer();

        audioPlayer.play("mp3","The Loneliest Girl");
        audioPlayer.play("mp4","The Loneliest Girl");
        audioPlayer.play("vlc","The Loneliest Girl");
        audioPlayer.play("avi","The Loneliest Girl");
    }
}
