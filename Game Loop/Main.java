import java.util.Scanner;

import javax.swing.SortOrder;

import java.util.Objects;

public class Main{
    public static void main(String[] args){

        // This makes the game run unless a user types "q" which makes the game stop and turning game = false
        boolean game = true;

        // These are the scores of the user and computer
        int computer_score = 0;
        int player_score = 0;

        Scanner scan = new Scanner(System.in);

        while (game) {
            // Displaying the score
            System.out.println("Computer score is " + computer_score + "\nPlayer score is " + player_score);

            // getting a random number by importing random
            float random_num = (float) (Math.random()*10);
            String computer_choice;
            
            // Getting user's choice
            System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors. Type 'q' for quit. ");
            String user_choice = scan.nextLine();

            // Getting the computer's choice
            if (random_num <= 3.3) {
                computer_choice = "r";
            }
            else if (random_num <= 6.6) {
                computer_choice = "p";
            }
            else {
                computer_choice = "s";
            }

            // Deciding the outcome
            // Deciding if the user and the computer draw
            if (Objects.equals(user_choice, computer_choice)) {
                System.out.println("Draw");
                if (Objects.equals(user_choice, "r")){
                    System.out.println("Computer Choice: rock \t Player choice: rock");
                }
                else if (Objects.equals(user_choice, "s")){
                    System.out.println("Computer Choice: scissors \t Player choice: scissors");
                }
                else {
                    System.out.println("Computer Choice: paper \t Player choice: paper");
                }
            }
            // Deciding if the user beat the computer
            else if (Objects.equals(user_choice, "r") && Objects.equals(computer_choice, "s") || Objects.equals(user_choice, "p") && Objects.equals(computer_choice, "r") || Objects.equals(user_choice, "s") && Objects.equals(computer_choice, "p")) {
                System.out.println("You Win!");
                // Adding a score to the player
                player_score += 1;
                if (Objects.equals(user_choice, "r")) {
                    System.out.println("Computer Choice: scissor \t Player Choice: Rock");
                }
                else if (Objects.equals(user_choice, "p")){
                    System.out.println("Computer Choice: rock \t Player choice: Paper");
                }
                else {
                    System.out.println("Computer Choice: paper \t Player choice: Scissor");
                }
            }
            // Deciding if the computer beat the user
            else if (Objects.equals(user_choice, "r") && Objects.equals(computer_choice, "p") || Objects.equals(user_choice, "p") && Objects.equals(computer_choice, "s") || Objects.equals(user_choice, "s") && Objects.equals(computer_choice, "r")) {
                System.out.println("You Lose!");
                // Adding a score to the computer
                computer_score += 1;
                if (Objects.equals(user_choice, "r")) {
                    System.out.println("Computer Choice: Paper \t Player Choice: Rock");
                }
                else if (Objects.equals(user_choice, "p")){
                    System.out.println("Computer Choice: Scissor \t Player choice: Paper");
                }
                else {
                    System.out.println("Computer Choice: Rock \t Player choice: Scissor");
                }
            }
            // This turns the game off when user types "q"
            else if (Objects.equals(user_choice, "q")) {
                game = false;
            }
            // Deciding if the user typed an invalid choice
            else {
                System.out.println("Invalid selection please play again.");
            }
            System.out.println("\n ************************************************************ \n");
        }
    }
}
