package JavaLearning;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("Audio.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        //String name = JOptionPane.showInputDialog("Enter your name");  //Esto es para que el programa no se cierre al quedarse sin lineas de codigo

        Scanner scanner = new Scanner(System.in);
        String response = "";

        while(!response.equals("Q")) {
            System.out.println("P = play, S = stop, R = reset, Q = Quit");
            System.out.println("Enter your choice");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"): clip.start();
                    break;
                case("S"): clip.stop();
                    break;
                case("R"): clip.setMicrosecondPosition(0);
                break;
                case("Q"): clip.close();
                    break;
                default: System.out.println("Not a valid response");
                    break;
            }
        }
        scanner.close();
    }
}
