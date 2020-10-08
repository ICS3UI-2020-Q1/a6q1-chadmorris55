import java.util.Scanner;
/**
 * gets a inputted amount of numebrs finds the average of said numbers, prints the average and all numbers above average
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    //Asks how many inputs the user wants
    System.out.println("How many heights would you like to enter");
    int arrayLength = input.nextInt();
    //creates the array wth length based on what was just inputted
    int [] heights = new int[arrayLength];
    //asks user to enter the heights and records each one
    System.out.println("Please enter the heights on separate lines");
    for (int i = 0; i < heights.length; i++){
      heights[i] = input.nextInt();
    }
    //adds all to get a sum then gets the average from the sum
    int sum = 0;
    for (int j = 0; j < heights.length; j++){
      sum = sum + heights[j];
    } 
    int average = sum / heights.length;
    System.out.println("The average height is " + average + " cm");
    //above average numbers go here
    System.out.println("The heights above average are");
    //finds numbers above average and prints them
    for (int k = 0; k < heights.length; k++){
      if (heights [k] > average){
        System.out.println(heights [k]);
      }
    }
    
  }
}
