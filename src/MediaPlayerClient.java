import java.util.Scanner;

public class MediaPlayerClient {
    public static void main(String[] args) {
        // Create an AudioPlayer and a basic Speaker
        AudioPlayer audioPlayer = new SimpleAudioPlayer();
        Speaker basicSpeaker = new BasicSpeaker();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an audio format (MP3 or FLAC):");
        String selectedFormat = scanner.next();

        // Ask the user for the song's file name
        System.out.println("Enter the song file name:");
        String songFileName = scanner.next();

        // Play audio using the selected format and the AudioPlayer or the basic Speaker with the Adapter
        if ("MP3".equalsIgnoreCase(selectedFormat)) {
            audioPlayer.playAudio("MP3", songFileName);
        } else if ("FLAC".equalsIgnoreCase(selectedFormat)) {
            AudioPlayer speakerAdapter = new SpeakerAdapter(basicSpeaker, "FLAC");
            speakerAdapter.playAudio("FLAC", songFileName);
        } else {
            System.out.println("Unsupported audio format.");
        }
    }
}
