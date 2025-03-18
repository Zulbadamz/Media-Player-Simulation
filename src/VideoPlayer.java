public class VideoPlayer implements MediaPlayer {
    @Override
    public void play(String mediaTitle) {
        System.out.println("Playing video: " + mediaTitle);
    }

    @Override
    public void pause() {
        System.out.println("Video paused.");
    }

    @Override
    public void stop() {
        System.out.println("Video stopped.");
    }
}
