 import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new adventure...\n");
       String command = ""; // stores the user's choices

       // STEP #1: Describe the current scenario 
       System.out.println("You are on Earth, ready for launch!");
       // STEP #2: Get user command 
       command = getCommand("Do you go east (e) to orbit or north (n) to the Moon?");
       // STEP #3: Select a path based on the user's command
       if ( command.equals("e") ) {
         System.out.println("You reach the Nternational Space Station (ISS)! Astronauts cheer as you float inside.");
       }
       else if ( command.equals("n") ) {
        System.out.println("You land on the Moon. Its cool, but super dusty. REALLY dusty.");
        System.out.println("Wanna stay on the Moon or swing dangerously close to the Sun?");
        command = getCommand("Fly to Mars and become famous as the first human on the Mars, or play it safe? (w = go / s = nope)");
        if ( command.equals ("s") ) {
          System.out.println("Do you explore deeper or turn back? (n = explore / s = turn back)");

              command = getCommand ("Would you want to go (n/s)" );
          if ( command.equals("n") ) {
            System.out.println("You find a tiny black hole. Do you dare to saty inside? or spooky but awesome.");
          }
          else if ( command.equals ("s") ) {
            System.out.println("You land on a exo-plant, Maybe there is other living things want to see them |Yes, No| ");

            command = getCommand("Meet the aliens? (n = yes / w = no");
          if ( command.equals ("n")){
            System.out.println("The aliens invite you to a space party. Zero-gravity dancing is wild.");
          }
          else if ( command.equals("w") ){
            System.out.println("You float next to a giant space dog. Honestly it's really HUGE and duangers it could eat you with one bit.");
            System.out.println("You drift past the edge of the universe—oops.");

            command = getCommand("Two universes are colliding! Watch or run? (w = watch / s = run)");
            if (command.equals("w")) {
              System.out.println("You watch two universes crash with each other, it's Beautiful and Kinda loud and mind-blowing!");
            }

          }
          }

        }
        else if ( command.equals ("w")) {
          System.out.println("You nap on Saturn's rings. Best sleep of your life. 10/10 experience.");
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
