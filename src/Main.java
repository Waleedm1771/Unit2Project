
import java.util.Scanner;

public class Main
{
    public static void main() throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        int game;
        System.out.println("\nWhat game would you like to play? Type: ");
        System.out.println("1: Rock Paper Scissors");
        System.out.println("2: Tic Tac Toe");
        System.out.println("3: Hide and Seek\n");
        game = scan.nextInt();
        while (game != 1 && game != 2 && game != 3) {
            System.out.println("That's not a valid game!");
            System.out.println("Type 1, 2, or 3.\n");
            game = scan.nextInt();
        }
        if (game == 1) {
            RockPaperScissors();
        } else if (game == 2) {
            TicTacToe();
        } else if (game == 3) {
            HideAndSeek();
        }
    }

    public static void RockPaperScissors() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int rounds;
        int playerScore = 0;
        int gameScore = 0;
        System.out.println("\nYou chose Rock Paper Scissors! I'm sure you know how to play, but I'll explain just in case.");
        Thread.sleep(2000);
        System.out.println("- Choose either Rock, Paper, or Scissors, and I'll do the same.\n- Paper beats Rock, Rock beats Scissors, and Scissors beats Paper.");
        Thread.sleep(2000);
        System.out.println("- If it's a tie, then we both get a point.\n- Finally, choose the amount of rounds, and we'll play.\n");
        Thread.sleep(1000);
        System.out.print("Amount of Rounds: ");
        rounds = scan.nextInt();
        System.out.println("\n Great, let's play!\n");
        System.out.println("When I say \"Shoot\", then type \"Rock\", \"Paper\", or \"Scissors\"\n");
        Thread.sleep(1000);
        for (int i = 1; i <= rounds; i++) {
            if (RockPaperScissors.play(i) == 1){
                playerScore++;
            } else if (RockPaperScissors.play(i) == 2) {
                gameScore++;
            } else if (RockPaperScissors.play(i) == 3) {
                playerScore++;
                gameScore++;
            }
            Thread.sleep(2000);
        }

        if (gameScore > playerScore) {
            System.out.println("Aww, you lost. Try again next time!");
            System.out.println("Final score: " + playerScore + " - " + gameScore);
        } else if (playerScore > gameScore) {
            System.out.println("Congratulations, you won!");
            System.out.println("Final score: " + playerScore + " - " + gameScore);
        } else if (playerScore == gameScore) {
            System.out.println("It was a tie!");
            System.out.println("Final score: " + playerScore + " - " + gameScore);
        }
    }

    public static void TicTacToe() throws InterruptedException {
        System.out.println("TicTacToe doesn't work :(");

//        Scanner scan = new Scanner(System.in);
//        int rounds = 0;
//        int playerScore = 0;
//        int gameScore = 0;
//
//        System.out.println("Hey, this is Tic-Tac-Toe, a classic!");
//        Thread.sleep(2500);
//        System.out.println("I'm sure you know the rules;");
//        Thread.sleep(2000);
//        System.out.println("Get 3 in a row in any direction, and you win.");
//        Thread.sleep(2000);
//        System.out.println("Here's the thing, the board is going to look like this:");
//        System.out.println("\n 1 | 2 | 3 \n-----------\n 4 | 5 | 6 \n-----------\n 7 | 8 | 9 \n");
//        Thread.sleep(4000);
//        System.out.println("Take a second to look at it.");
//        Thread.sleep(1500);
//        System.out.println("When it's your turn, you'll be asked to place your symbol.");
//        Thread.sleep(2000);
//        System.out.println("You'll respond with the location of the box (meaning \"1\", \"2\", \"3\", and so on...).");
//        Thread.sleep(2500);
//        System.out.println("Also, the bot just sort of places it's symbols randomly. Don't expect it to win.");
//        Thread.sleep(2500);
//        System.out.println("Got it? Good. Now just pick the amount of rounds and we'll start.");
//        Thread.sleep(1000);
//        System.out.print("\nAmount of rounds: ");
//        rounds = scan.nextInt();
//        Thread.sleep(750);
//        System.out.println("\nGreat. Let's go ahead and start.");
//
//        for (int i = 1; i <= rounds; i++) {
//            if (TicTacToe.play(i) == 1){
//                playerScore++;
//            } else if (TicTacToe.play(i) == 2) {
//                gameScore++;
//            } else if (TicTacToe.play(i) == 3) {
//                playerScore++;
//                gameScore++;
//            }
//            Thread.sleep(2000);
//        }
//
//        if (gameScore > playerScore) {
//            System.out.println("You lost. Try again next time!");
//            System.out.println("Final score: " + playerScore + " - " + gameScore);
//        } else if (playerScore > gameScore) {
//            System.out.println("Good job, you won!");
//            System.out.println("Final score: " + playerScore + " - " + gameScore);
//        } else if (playerScore == gameScore) {
//            System.out.println("It was a tie!");
//            System.out.println("Final score: " + playerScore + " - " + gameScore);
//        }
    }

    public static void HideAndSeek() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int playerScore = 0;
        System.out.println("Alright! It's time to play hide and seek!\n");
        Thread.sleep(2500);
        System.out.println("Here's how it's gonna work:");
        Thread.sleep(1000);
        System.out.println("Im going to hide in one of 3 spots,");
        Thread.sleep(1000);
        System.out.println("You will guess where I am 2 times");
        Thread.sleep(1000);
        System.out.println("If you guess it right in those 2 tries, you win!");
        Thread.sleep(1000);
        System.out.println("Choose the amount of rounds and let's begin!\n");
        System.out.print("Amount of rounds: ");
        int rounds = scan.nextInt();
        System.out.println("\nIt's time to play, don't peek!\n");
        for (int i = 1; i <= rounds; i++) {
            if (HideAndSeek.play(i) == 1){
                playerScore++;
            }
            Thread.sleep(3000);
        }

        System.out.println("Final Score: " + playerScore + " out of " + rounds + " games won!");
    }
}