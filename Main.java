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
         System.out.println("You reach the Nternational Space Station (ISS).");
       }
       else if ( command.equals("n") ) {
        System.out.println("You are on the Moon");
        System.out.println("Or you want to go around the sun");
        command = getCommand("Wanna go to Mars and be the first human on the Mars? (w/s)");
        if ( command.equals ("s") ) {
          System.out.println("Wanna go on the moon of Mars and put your're flag on the moon");

              command = getCommand ("Would you want to go (n/s)" );
          if ( command.equals("n") ) {
            System.out.println("Wanna to go inside a small black hole to see wants there");
          }
          else if ( command.equals ("s") ) {
            System.out.println("want to go on a exo-plant and see if there is life and other living things |Yes, No| ");

            command = getCommand("Wanna to meet aliens and talk to them (n/w)");
          if ( command.equals ("n")){
            System.out.println("Youn meet aliens wanna party with them all night");
          } 
          else if ( command.equals("w") ){
            System.out.println("");
          }
          }
          

        }
        else if ( command.equals ("w")) {
          System.out.println("Wanna sleep for one night on the Saturn Rings!");
        }
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
       return command;
    } // END OF METHOD
 } // END OF CLASS
