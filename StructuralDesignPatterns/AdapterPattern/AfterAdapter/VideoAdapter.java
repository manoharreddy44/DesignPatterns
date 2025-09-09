package StructuralDesignPatterns.AdapterPattern.AfterAdapter;

class VideoAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;

    public VideoAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String filename) {
        videoPlayer.playVideo(filename); // Adapting the call
    }
}