public class StreamingPlayer implements MediaPlayer {
    @Override
    public void play(String mediaTitle) {
        System.out.println("Streaming media: " + mediaTitle);
    }

    @Override
    public void pause() {
        System.out.println("Streaming paused.");
    }

    @Override
    public void stop() {
        System.out.println("Streaming stopped.");
    }
}
