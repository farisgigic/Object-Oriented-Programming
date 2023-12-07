package Week_10.ThirdTask;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Enumeration;
import java.util.Random;

public class Events {
    private static final int numOfRecords = 1000000;
    private static final int userId = 999;
    private static final String[] eventTypes = {"Login","Logout","Purchase","ViewPage","Error"};

    public static void main(String[] args) throws IOException {
        String fileName = "events.txt";
        generateEventsFile(fileName, numOfRecords);
        readEventsFile(fileName);

    }
    public static void generateEventsFile(String fileName, int numOfRecords) throws IOException {
        try {
            BufferedWriter writer  = new BufferedWriter(new FileWriter(fileName));
            Random random = new Random();
            String Timestamp = "2023-12-07";
            int randomItem = random.nextInt(eventTypes.length);
            String randomElement = eventTypes[randomItem];
            int randomItem1 = random.nextInt(userId + 1); // including 999
            String event = Timestamp + " " + randomElement + " " + randomItem1;
            writer.write(event);
            writer.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void readEventsFile(String fileName){

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                int counter = 0;
                while((line = reader.readLine()) != null){
                    System.out.println(reader.readLine());
                    counter++;
                    if(counter >= 5){
                        break;
                    }
                }
                reader.close();

            }

        catch (IOException e){
            e.printStackTrace();
        }
    }
}
