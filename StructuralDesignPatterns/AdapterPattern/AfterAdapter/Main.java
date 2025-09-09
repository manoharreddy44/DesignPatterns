package StructuralDesignPatterns.AdapterPattern.AfterAdapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayer audio = new AudioPlayer();
        audio.play("song.mp3");

        MediaPlayer video = new VideoAdapter(new VideoPlayer());
        video.play("movie.mp4");
    }
}

