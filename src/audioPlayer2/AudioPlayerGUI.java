package audioPlayer2;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import javax.swing.*;

public class AudioPlayerGUI extends JFrame {

    private Clip clip;
    private final JButton playButton;
    private final JButton stopButton;
    private final JButton resetButton;
    private final JButton quitButton;
    private final JLabel statusLabel;

    public AudioPlayerGUI() {
        setTitle("Java Audio Player 🎵");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        
        String filePath = "C:\\Users\\LENOVO\\Desktop\\Java\\src\\audioPlayer2\\Butterfly - Patrick Patrikios.wav";
        File audioFile = new File(filePath);

        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            JOptionPane.showMessageDialog(null, "Error loading audio: " + e.getMessage());
            System.exit(1);
        }

        
        statusLabel = new JLabel("Ready to play", SwingConstants.CENTER);
        add(statusLabel, BorderLayout.NORTH);

       
        JPanel buttonPanel = new JPanel();
        playButton = new JButton("▶ Play");
        stopButton = new JButton("⏹ Stop");
        resetButton = new JButton("⏮ Reset");
        quitButton = new JButton("❌ Quit");

        buttonPanel.add(playButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(quitButton);
        add(buttonPanel, BorderLayout.CENTER);

        
        playButton.addActionListener(_-> {
            clip.start();
            statusLabel.setText("Playing...");
        });

        stopButton.addActionListener(_ -> {
            clip.stop();
            statusLabel.setText("Stopped");
        });

        resetButton.addActionListener(_ -> {
            clip.setMicrosecondPosition(0);
            statusLabel.setText("Reset to beginning");
        });

        quitButton.addActionListener(_ -> {
            clip.close();
            dispose();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AudioPlayerGUI::new);
    }
}