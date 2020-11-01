/*****
* Name: Feras
* Description: To use the Switch statement and random method to develop a rock,
* paper, and scissors game and to show whether the user won or loss
 *****/

//import
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args){
         //create scanner object
        Scanner input = new Scanner(System.in);
        //prompt the user for input information
      System.out.print("Enter 0 for Scissor, 1 for Rock,and 2 for Paper: ");
      //take user input and change it to integer  
        int user = input.nextInt();
        int randNumber = (int)(Math.random() * 2);//declare a random obj
        
        //check user input using the switch case and if statement to compar
        //user input and display what the result is
        switch(user){
            case 0: 
                if(user == randNumber)
                System.out.println("The computer is Scissor 0. You are Scissor"
                        + " too. It is a draw");         
                else if(user == 0 && randNumber == 1)
                System.out.println("The computer is Rock 1. You are Scissor."+
                         " You lost! ");   
                else if (user == 0 && randNumber == 2)
                System.out.println("The computer is Paper 2. Your are Scissor"+
                        " You Won! "); 
            break;
            case 1 :
                if(user == randNumber)
                System.out.println("The computer is Rock 1. You are Rock too."
                        + " It is a draw");
                else if (user == 1 && randNumber == 0)
                System.out.println("The computer is Scissor 0. You are Rock."
                        + " You Won!");
                else if (user == 1 && randNumber == 2)
                System.out.println("The computer is Paper 2. You are Rock."
                        + " You lost!");
            break;
            case 2: if(user == randNumber)
                System.out.println("The computer is Paper 2. You are Paper too."
                        + " It is a draw");
                else if (user == 2 && randNumber == 0)
                System.out.println("The computer is Scissor 0. You are Paper."
                        + " You lost!");
                else if (user == 2 && randNumber == 1)
                System.out.println("The computer is Rock 1. You are Paper."
                        + " You Won!");
            break;
            default:// if the input is not between 0 and 2 give error message
              System.out.println("Invalid Input");
             System.exit(1); 
    }//end switch
        
}//end main
}//end class