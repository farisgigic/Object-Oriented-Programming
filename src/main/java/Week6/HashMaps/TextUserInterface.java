package Week6.HashMaps;
import jdk.jshell.Snippet;
import java.util.Scanner;
import java.util.Dictionary;
import java.util.HashMap;

public class TextUserInterface {

    Scanner scanner;
    Dictionary  userDictionary;
    public TextUserInterface(Scanner scanner, Dictionary dictionary) {
        this.scanner = scanner;
        this.userDictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println("Quit - exits the text user interface");
        System.out.println("Add - adds new item to dictionary");
        System.out.println("Translate - finds the translation of a word if it exists in the dictionary");
        while(true) {
            System.out.print("Statement: ");
            String command = scanner.nextLine();
            switch (command) {
                case "Quit":
                    System.out.println("Adios!");
                    System.exit(0);
                    break;

                case "Add":
                    System.out.print("In Bosnian: ");
                    String word = scanner.nextLine();
                    System.out.print("Translation: ");
                    String translation = scanner.nextLine();
                    this.userDictionary.add(word, translation);
                    break;

                case "Translate":
                    System.out.print("Give a word: ");
                    String wordInput = scanner.nextLine();
                    String translationOutput = "";
                    for(String w : this.userDictionary.getMap().keySet()) {
                        if(!this.userDictionary.getMap().containsKey(wordInput)) {
                            translationOutput = "word not found";
                            break;
                        }
                        if(w.equals(wordInput)) {
                            translationOutput = this.userDictionary.getMap().get(w);
                            break;
                        }
                    }
                    System.out.println("Translation: " + translationOutput);
                    break;

                default:
                    System.out.println("Unknown statement");
                    break;

            }
        }
    }
}
}
