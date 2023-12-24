package Week_12;

import java.io.*;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java ChatClient <username> <server_ip>");
            System.exit(1);
        }
        String username = args[0];
        String serverIp = args[1];
        int serverPort = 12345;

        try {
            Socket socket = new Socket(serverIp, serverPort);


            BufferedWriter serverWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            // Use PrintWriter with auto-flushing
            PrintWriter printWriter = new PrintWriter(serverWriter, true);

            // Send the username to the server
            ;System.out.println("Connected to server. Sending username...");


            printWriter.println(username);
            System.out.println("Username sent to server: " + username);

            new Thread(() -> {
                try {
                    BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String message;
                    while ((message = serverReader.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader((System.in)));
            String userInput;
            while ((userInput = consoleReader.readLine()) != null) {
                printWriter.println(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}