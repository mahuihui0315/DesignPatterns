package AdapterPattern;

/**
 *实现了MediaPlayer,同时具有适配器功能的实例类
 */
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3"))
            System.out.println("Playing mp3 fileName:  "+fileName);
        else if (audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("Invalid media: "+audioType+" format not supported");
        }
    }
}
