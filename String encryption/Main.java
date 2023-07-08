import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // This makes the while loop run forever until the user quits
        boolean game = true;

        while(game) {

            // Asking the user if they want to encode or decode or simply type 'q' if they want to quit
            System.out.println("Type 'e' if you want to encode and type 'd' if you want to decode or type 'q' if you want to quit ");
            String user_choice = scan.nextLine();

            String final_word = "";

            // Check to see if the user wants to encode or decode
            if (user_choice.equals("e")){
                // Getting the words that user wants to encode
                System.out.println("Type the words that you want to encode ");
                String user_words = scan.nextLine();

                // Make the words into an array
                String[] arr_words = user_words.split(" ");

                // Each word starts with the last letter that the word originally started with and the last letter is replaced with "er "
                for (int i=0; i<arr_words.length; i++) {
                    final_word += (arr_words[i].substring(arr_words[i].length()-1) + arr_words[i].substring(0, arr_words[i].length()-1) + "er ");
                }
            }
            else if (user_choice.equals("d")){
                // Getting the words that user wants to encode
                System.out.println("Type the words that you want to encode ");
                String user_words = scan.nextLine();

                // Make the words into an array
                String[] arr_words = user_words.split(" ");

                // Decode the words by getting rid of -er and replacing it with the letter that the word starts with
                for (int i=0; i<arr_words.length; i++) {
                    final_word += (arr_words[i].substring(1, arr_words[i].length()-2) + arr_words[i].substring(0, 1) + " ");
                }
            }
            // When the user types 'q' then the program will stop by changing game = false
            else if (user_choice.equals("q")){
                System.out.println("Thank you for playing!!!");
                game = false;
            }
            // If a user types a random thing then the program will tell them
            else {
                System.out.println("Please type something valid");
            }

            // if the final_word is empty then it will end the loop and go on to the next one
            if (final_word.equals("")) {
                System.out.println("\n ***************************************************** \n");
            }
            // Print the words that are encoded or decoded
            else {
                System.out.println("The word is: " + final_word);
                System.out.println("\n ***************************************************** \n");
            }
        }
    }
}