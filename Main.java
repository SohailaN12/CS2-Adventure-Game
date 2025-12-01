 import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new adventure...\n");
       String command = ""; // stores the user's choices

       // STEP #1: Describe the current scenario 
       System.out.println("You are on Earth.");
       // STEP #2: Get user command 
       command = getCommand("Do you go east (e) or north (n)");
       // STEP #3: Select a path based on the user's command
       if ( command.equals("e") ) {
         System.out.println("You reach the nternational Space Station (ISS).");
       }
       else if ( command.equals("n") ) {
         System.out.println("You go to the Moon" );
       }
       else {
         System.out.println("GAME OVER! START OVER");
       }

          
    } // END OF MAIN METHOD
    
    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       scan.close();
       return command;
    } // END OF METHOD
 } // END OF CLASS
