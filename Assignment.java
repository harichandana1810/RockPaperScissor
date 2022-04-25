import java.util.Scanner;
class Main { public static void main(String[] args) {
  //Initialize the Scanner and print a welcome message 
  Scanner in = new Scanner(System.in); 
  System.out.println("Rock, Paper, scissor game is an interesting game. Come let's defeat the system."); 
  System.out.println("\nPlease go through the rules.\n*The rock will beat scissor every time but will be beaten by paper.*\n*Paper will beat rock but will be beaten by scissor.*\n*Scissor will beat paper but will be beaten by rock.*\n Thats about the game. **** Now let's have a fun. ****\n"); 
  //game will be continued until user enters quit. 
  while(true) 
  { 
    System.out.print("To start the game, please enter your option Rock, Paper or Scissor. To stop the game, please enter quit: \n"); 
    String myMove = in.nextLine(); 
    //Check if the user wants to quit the game 
    if(myMove.equals("quit")) 
    { 
      break;
    }
    //Check if the user's move is valid (rock, paper, or scissor) 
    if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissor")) 
    { 
      System.out.println("Sorry, the option is not in this game! Try again.\n"); 
    } 
    else { 
      //Get a random number in between 0 and 3 and convert it to an integer so that the possibilities are 0, 1, or 2 
      int rand = (int)(Math.random()*3); 
      //Convert the random number to a string using conditionals and print the system's move 
      String systemsMove = ""; 
      if(rand == 0) 
      { 
        systemsMove = "rock"; 
      } 
      else if(rand == 1) 
      { 
        systemsMove = "paper"; 
      } 
      else 
      { 
        systemsMove = "scissor"; 
      }
      System.out.println("system move: " + systemsMove);
      //Print the results of the game: tie, lose, win 
      if(myMove.equals(systemsMove)) 
      { 
        System.out.println("It's a tie!"); 
      } else if((myMove.equals("rock") && systemsMove.equals("scissor")) || (myMove.equals("scissor") && systemsMove.equals("paper")) || (myMove.equals("paper") && systemsMove.equals("rock"))) 
      { 
        System.out.println("You won!"); 
      } 
      else 
      {
        System.out.println("You lost!"); 
      } 
    } 
  }
  System.out.println("I hope you enjoyed the game and had fun! "); 
}
}
