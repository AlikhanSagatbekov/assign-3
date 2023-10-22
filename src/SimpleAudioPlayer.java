public class SimpleAudioPlayer implements AudioPlayer {
    public void playAudio(String audioType, String fileName) {
        System.out.println("Playing " + audioType + " file: " + fileName);
    }
}
