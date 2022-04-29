import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Question5
{
  public static void main(String[] args)
  {
    /*
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the size of your array: ");
    int size = in.nextInt();
    List<Integer> inputList = new ArrayList<Integer>();
    for (int i = 0; i < size; i++)
    {
      System.out.print("Enter integer: ");
      int inputs = in.nextInt();
      inputList.add(inputs);
    }
    
    int maxNumber = 0;
    int Appearance = 0;
    for (int i = 0; i < inputList.size(); i++)
    {
      int count = 0;
      for (int j = 0; j < inputList.size(); j++)
      {
        if (inputList.get(i) == inputList.get(j))
        count += 1;
      }
      if (count > Appearance)
      {
        maxNumber = inputList.get(i);
        Appearance = count;
      }
    }
    System.out.println("The mode of the dataset is: " + maxNumber);
    in.close();

    
  }
}
