package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.utils.AudioPlayer;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayerAdapter;
import edu.unisabana.dyas.patterns.utils.AdvancedAudioPlayer;

public class Client {
    public static void main(String[] args) {
        AdvancedAudioPlayer advancedPlayer = new AdvancedAudioPlayer();

        AudioPlayer advancedPlayerAdapter = new AdvancedAudioPlayerAdapter(advancedPlayer);
        advancedPlayerAdapter.play("mp4", "video");
        advancedPlayerAdapter.stop();

        advancedPlayerAdapter.play("vlc", "video2");
        advancedPlayerAdapter.stop();
    }
}