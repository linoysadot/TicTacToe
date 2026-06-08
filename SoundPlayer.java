import javax.sound.sampled.*;
import java.io.File;
    public class SoundPlayer {
        public static void play(String fileName) {
            try {
                File file = new File(fileName);

                AudioInputStream stream = AudioSystem.getAudioInputStream(file);
                Clip clip = AudioSystem.getClip();
                clip.open(stream);
                clip.start();
            } catch (Exception e) {
                System.err.println("שגיאה בהפעלת הסאונד: " + e.getMessage());
            }

        }

        }