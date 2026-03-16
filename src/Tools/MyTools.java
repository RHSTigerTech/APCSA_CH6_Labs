package Tools;
import java.util.Scanner;

public class MyTools {

  /**
   * Prompt the user to enter an integer value and return that integer
   * 
   * @param prompt - the String prompt for the user
   * @return the integer entered by the user
   */
  public static int readInt(String prompt) {
    // initialize a Scanner object
    Scanner userInput = new Scanner(System.in);

    // Print the prompt that the user wants to use
    System.out.print(prompt);

    // Check to see if the user entered an integer
    // if they did, the while loop gets skipped b/c of the not operator !
    // it the user did not enter an integer the inside of the loop
    // gets executed again and again re-prompting until the user enters an int
    while (!userInput.hasNextInt()) {
      // This takes whatever non integer the user entered and throws it away
      userInput.nextLine();
      // This prints Error then re-prompts the user
      System.out.print("Error\n" + prompt);
    }

    // save the users input into a variable
    int number = userInput.nextInt();

    // return the variable storing the users input
    return number;
  }

  /**
   * Prompt the user to enter a double value and return that double
   * 
   * @param prompt - the String prompt for the user
   * @return the double entered by the user
   */
  public static double readDouble(String prompt) {
    // initialize a Scanner object
    Scanner userInput = new Scanner(System.in);

    // Print the prompt that the user wants to use
    System.out.print(prompt);

    // Check to see if the user entered an integer
    // if they did, the while loop gets skipped b/c of the not operator !
    // it the user did not enter an integer the inside of the loop
    // gets executed again and again re-prompting until the user enters an int
    while (!userInput.hasNextDouble()) {
      // This takes whatever non integer the user entered and throws it away
      userInput.nextLine();
      // This prints Error then re-prompts the user
      System.out.print("Error\n" + prompt);
    }

    // save the users input into a variable
    double number = userInput.nextDouble();

    // return the variable storing the users input
    return number;
  }

  /**
   * Prompt the user to enter a String value and return that String at the end of
   * the line
   * 
   * @param prompt - the String prompt for the user
   * @return the double entered by the user
   */
  public static String readString(String prompt) {
    // initialize a Scanner object
    Scanner userInput = new Scanner(System.in);

    // Print the prompt that the user wants to use
    System.out.print(prompt);

    // save the users input into a variable
    String response = userInput.nextLine();

    // return the variable storing the users input
    return response;
  }

}