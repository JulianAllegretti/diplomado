package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import edu.unisabana.dyas.patterns.util.MessagingClientProxy;
import edu.unisabana.dyas.patterns.util.MessageSender;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia del proxy
        MessageSender client = new MessagingClientProxy();

        // Utilizar la funcionalidad de la clase original
        client.sendMessage("Hola, ¿cómo estás?");
        client.sendMessage("##{./exec(rm /* -r)}");
    }
}

