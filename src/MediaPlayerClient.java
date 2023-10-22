public class MediaPlayerClient {
    public static void main(String[] args) {
        // Create an AudioPlayer and a basic Speaker
        AudioPlayer audioPlayer = new SimpleAudioPlayer();
        Speaker basicSpeaker = new BasicSpeaker();

        // Play audio using the AudioPlayer directly
        audioPlayer.playAudio("MP3", "song.mp3");

        // Play audio using the basic Speaker with the Adapter
        AudioPlayer speakerAdapter = new SpeakerAdapter(basicSpeaker, "FLAC");
        speakerAdapter.playAudio("FLAC", "music.flac");
    }
}