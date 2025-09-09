package StructuralDesignPatterns.AdapterPattern.BeforeAdapter;

class AudioPlayer implements MediaPlayer {
    public void play(String filename) {
        System.out.println("Playing audio file: " + filename);
    }
}
