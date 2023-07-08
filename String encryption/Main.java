import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // When someone types 'q' the game = false and the while loop will stop
        boolean game = true;

        while (game) {
            // Getting the words that user wants to encode
            System.out.println("Type the words that you want to encode ");
            String user_words = scan.nextLine();

            // Make the words into an array
            String[] arr_words = user_words.split(" ");

            String final_word = "";

            // Each word starts with an "e" and the last letter is replaced with "er "
            for (int i=0; i<arr_words.length; i++) {
                final_word += ("e" + arr_words[i].substring(0, arr_words[i].length()-1) + "er ");
            }

            // Print the words that are encoded
            System.out.println(final_word);

            // ask the user if they want the words to be decoded, try again or to quit
            System.out.println("Type 'y' if you want to decode the words, type 'n' to try encode something again or type 'q' to quit ");
            String user_choice = scan.nextLine();
            // End the while loop
            if (user_choice.equals("q")){
                System.out.println("Thank you for playing!!!");
                game = false;
            }
            // Decoding the words by just printing what the user typed out originally
            else if (user_choice.equals("y")){
                System.out.println("The decode words are: " + user_words);
            }
            System.out.println("\n ********************************************************************************** \n");
        }
    }
}