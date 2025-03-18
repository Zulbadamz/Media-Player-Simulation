public class MediaPlayerTest {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        MediaPlayer videoPlayer = new VideoPlayer();
        MediaPlayer streamingPlayer = new StreamingPlayer();

        System.out.println("Testing Audio Player:");
        audioPlayer.play("Song A");
        audioPlayer.pause();
        audioPlayer.stop();

        System.out.println("\nTesting Video Player:");
        videoPlayer.play("Movie B");
        videoPlayer.pause();
        videoPlayer.stop();

        System.out.println("\nTesting Streaming Player:");
        streamingPlayer.play("Live Stream C");
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}
