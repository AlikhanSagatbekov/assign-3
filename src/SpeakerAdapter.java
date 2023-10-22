public class SpeakerAdapter implements AudioPlayer {
    private Speaker speaker;
    private String audioFormat;

    public SpeakerAdapter(Speaker speaker, String audioFormat) {
        this.speaker = speaker;
        this.audioFormat = audioFormat;
    }

    public void playAudio(String audioType, String fileName) {
        // Adapt AudioPlayer's playAudio method to Speaker's playSound method
        speaker.playSound(audioFormat, fileName);
    }
}