package Week_12;

public class ChatApplication {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        chatServer.start(12345);
    }
}
