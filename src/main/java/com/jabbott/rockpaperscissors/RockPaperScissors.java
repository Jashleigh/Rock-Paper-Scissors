package com.jabbott.rockpaperscissors;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jessicaabbott
 */
public class RockPaperScissors {
    public static void main(String[] args) {

    //This gets the move from the user
    Scanner scanner = new Scanner(System.in);
    //String array called rps for rock, paper, scissors.
    String[] rps = {"r", "p", "s"};
    //Computers move will come from an element of the string array "rps". We want a random index length between 0-2 for "rps".
    String computerMove = rps[new Random().nextInt(rps.length)];

    //computerMove is already defined in the method main(String[])
    String playerMove;
    //Tallys wins for use and computer
    int playerWins = 0;
    int computerWins = 0;
    int tieCount = 0;



    //int round_count;

    //round_count = round_count+1


    /**Created loop to keep the game on repeat
    until user enters something invalid or number of rounds are over */
    while(true) {
        //Prints the following output to user

        System.out.println("Welcome to Rock, Paper and Scissors!");
        System.out.println("\nHow many rounds would you like to play? Pick number between 1-10.");
        int rounds = Integer.parseInt(scanner.nextLine());
        boolean PlayerMoveValidity = false;

        for (int round_count=0; round_count < rounds;round_count++) {

        System.out.println("Please enter your move (r - for rock, p - for paper, or s - for scissors)");
        //This will allow the next line of input from user via keyboard
        playerMove = scanner.nextLine();
        //if plays move is r or(||) p or s the loop will continue
        if (playerMove.equals ("r") || playerMove.equals ("p") || playerMove.equals ("s")) {
          PlayerMoveValidity = true;
        } else {
          //If user enters anything other than r, p or s they will see this error message.
          System.out.println(playerMove + " is not a valid move.");
          PlayerMoveValidity = false;
          //Break the loop if user enters other than r, p or s.
          continue;
        }



        //Prints out the computers move
        System.out.println("Computer played: " + computerMove);
        //If users input matches computers choice, this round is tied.
     if (playerMove.equals(computerMove)) {
        System.out.println("The game was a tie!");
        tieCount++;
     }

     //Or if the user chooses r and computer chooses p the computer wins.
     else if (playerMove.equals("r")) {
          if (computerMove.equals("p")) {
            System.out.println("You lose!");
            //++ adds a point to computers talley
            computerWins++;
           }
          else if (computerMove.equals("s")) {
            System.out.println("You win!");
            playerWins++;
          }

     }

     else if (playerMove.equals("p")) {
       if (computerMove.equals("r")) {
        System.out.println("You win!");
        playerWins++;
        }
       else if (computerMove.equals("s")) {
        System.out.println("You lose!");
        computerWins++;
        }

     }

     else if (playerMove.equals("s")) {
        if (computerMove.equals("p")) {
         System.out.println("You win!");
         playerWins++;
        }
        else if (computerMove.equals("r")) {
         System.out.println("You lose!");
         computerWins++;
        }
     }

} // Ends For loop
//System prints final score
System.out.println("Your Wins: " + playerWins + " Computer Wins: " + computerWins + " Ties: " + tieCount);

//If users points are greater than computers, the user wins!
 if(playerWins > computerWins)
   System.out.println("You are the ultimate winner!");


 else if (playerWins < computerWins) {
     System.out.println("The computer is the ultimate winner!");
 }

 else if (tieCount != 0 && playerWins == computerWins) {
     //Or if points are the same user and computer tied
     System.out.println("The game is tied!");
 }

//Ask user if they want to play again
System.out.println("Play again? (y/n)");
//Strings what the user chooses.
String playAgain = scanner.nextLine();
//If user does not(!) choose y system will assume user doesn't want to play again.
if (!playAgain.equals ("y"))
break;


}// Ends While
}// Ends Main Function
}// Ends RockPaperScissors
