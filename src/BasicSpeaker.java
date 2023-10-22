public class BasicSpeaker implements Speaker {
    public void playSound(String audioFormat, String sound) {
        System.out.println("Playing " + audioFormat + " sound: " + sound);
    }
}
