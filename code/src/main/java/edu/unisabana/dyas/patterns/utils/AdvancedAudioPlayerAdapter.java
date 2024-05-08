package edu.unisabana.dyas.patterns.utils;

// Clase que implementa una interfaz diferente
public class AdvancedAudioPlayerAdapter implements AudioPlayer {

    private AdvancedAudioPlayer audioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedPlayer) {
        this.audioPlayer = advancedPlayer;
    }

    public void play(String audioType, String fileName) {
        if (audioType == "mp4") {
            this.audioPlayer.playMp4(fileName + "." + audioType);
            return;
        }
        if (audioType == "vlc") {
            this.audioPlayer.playVlc(fileName + "." + audioType);
            return;
        }
    }

    public void stop() {
        this.audioPlayer.stop();
    }
}