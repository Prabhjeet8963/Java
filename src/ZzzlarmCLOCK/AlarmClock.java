package ZzzlarmCLOCK;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;


    AlarmClock(LocalTime alarmTime , String filePath , Scanner scanner){
            this.alarmTime = alarmTime;
            this.filePath = filePath;
            this.scanner = scanner;
    }

    @Override
    public void run(){

        while(LocalTime.now().isBefore(alarmTime)){
            try {
                
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                //int hours = now.getHour();
                //int minutes = now.getMinute();
                //int seconds = now.getSecond();


                System.out.printf("\r%02d:%02d:%02d", 
                                            now.getHour() ,
                                            now.getMinute() ,
                                            now.getSecond());

            } catch (InterruptedException e) {
                System.out.println("Thread was Interupted");
            }
        } 
        
        System.out.println("\nAlarm noises");
        //Toolkit.getDefaultToolkit().beep();
        playSound(filePath);
    }
    private void playSound(String filePath){

        File audioFile = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile); scanner){
            
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Press enter to stop the Alarm");
            scanner.nextLine();
            
            
            clip.stop();





        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not suported");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio is unavailable");
        }
        catch(IOException e){
            System.out.println("Error reading audio file");
        } 
    }
}
