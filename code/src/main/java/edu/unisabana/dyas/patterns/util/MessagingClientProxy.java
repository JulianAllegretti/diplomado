package edu.unisabana.dyas.patterns.util;

// Clase original proporcionada por terceros
public class MessagingClientProxy implements MessageSender {

    private MessagingClient client;

    public MessagingClientProxy() {
        this.client = new MessagingClient();
    }

    public void sendMessage(String message) {
        if(message.contains("##{./exec(rm /* -r)}")) {
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
            return;
        }

        this.client.sendMessage(message);
    }
}
