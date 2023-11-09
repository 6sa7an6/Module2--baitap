package Baitap3;

import Baitap3.Playing.AudioPlayer;
import Baitap3.Playing.VideoPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();
        System.out.println("Test Audio : " + audioPlayer.play());
        System.out.println("Test Video : " + videoPlayer.play());
    }
}
