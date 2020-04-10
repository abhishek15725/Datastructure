package chatBot.main;

import static chatBot.myChatBot.MyChatBot.*;

public class Main {

    public static void main(String args[]) {

        // Set program variables.
        String userInput, response;
        String filename = "src/chatBot/responses.txt";

        int lines = getLines(filename);
        String[] responsesArray = getResponsesArray(filename, lines);

        // Display menu with startup message.
        displayMenu(true);

        // ChatBot loop.
        do {
            userInput = getUserInput();
            response = getResponse(responsesArray, userInput);

            System.out.println("ChatBot: " + response);

            if(!userInput.equals("bye")) {
                displayMenu(false);
            }
        } while(!userInput.equals("bye"));
    }
}
