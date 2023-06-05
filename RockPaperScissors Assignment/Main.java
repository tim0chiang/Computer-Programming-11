import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Getting user's choice
        System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper and 's' for scissors.");
        String user_choice = scan.nextLine();
        
        // Randomly choosing computer's choice
        int random_num = (int) (Math.random()*100);
        String computer_choice;
        if (random_num <= 33) {
            computer_choice = "r";
        }
        else if (random_num <= 66) {
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
        // Deciding if the user typed an invalid choice
        else {
            System.out.println("Invalid selection please play again.");
        }
    }
}
