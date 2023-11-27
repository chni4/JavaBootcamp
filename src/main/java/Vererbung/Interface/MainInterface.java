package Vererbung.Interface;

public class MainInterface {
    public static void main(String[] args) {
        MediaController media = new MediaController();
        MusicPlayer music = new MusicPlayer();
        media.playMedia(music);
        VideoPlayer video = new VideoPlayer();
        media.playMedia(video);
    }
}
