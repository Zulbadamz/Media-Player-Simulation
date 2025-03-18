public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String mediaTitle) {
        System.out.println("Playing audio: " + mediaTitle);
    }

    @Override
    public void pause() {
        System.out.println("Audio paused.");
    }

    @Override
    public void stop() {
        System.out.println("Audio stopped.");
    }
}
