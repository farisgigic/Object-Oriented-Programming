package Week_12;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private List<ClientHandler> clients = new ArrayList<>();

    public void start(int port) {

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket);

                ClientHandler clientHandler = new ClientHandler(clientSocket, this);
                clients.add(clientHandler);

                Thread clientThread = new Thread(clientHandler);
                clientThread.start();


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void broadcastMessage(String message, ClientHandler sender) {
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.sendMessage(message);
            }
        }
    }

    private class ClientHandler implements Runnable {
        private Socket clientSocket;
        private BufferedReader reader;
        private PrintWriter writer;
        private ChatServer chatServer;

        public ClientHandler(Socket clientSocket, ChatServer chatServer) {
            this.clientSocket = clientSocket;
            this.chatServer = chatServer;
            try {
                reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                writer = new PrintWriter(clientSocket.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            try {
                String username = reader.readLine();
                System.out.println(username + " has joined to chat.");

                chatServer.broadcastMessage(username + " has joined the chat.", this);

                String message;

                while ((message = reader.readLine()) != null) {
                    chatServer.broadcastMessage(username + ":" + message, this);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    clientSocket.close();
                    clients.remove(this);
                    chatServer.broadcastMessage("User has left the chat", this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        public void sendMessage(String message) {
            writer.println(message);
        }
    }

    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();
        chatServer.start(12345);
    }
}
