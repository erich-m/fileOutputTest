import java.util.*;
import java.io.*;

public class fileOutputTest{
      public static void main(String [] args) throws FileNotFoundException{
          File inputFile = new File("num.txt");
          int [] nums = new int[lineCount(inputFile)];
          Scanner input = new Scanner(inputFile);
          
          int i = 0;
          while(input.hasNextLine()){
                int current = Integer.parseInt(input.nextLine());
                System.out.println(current);
                nums[i] = current;
                i++;
          }
          input.close();
          
          PrintWriter output = new PrintWriter(inputFile);
          for(int j = 0;j < nums.length;j++){
                nums[j]*=2;
                output.println(nums[j]);
                output.flush();
          }
          output.print(2);
          output.flush();
          
          output.close();
      }
      
      public static int lineCount(File inputFile) throws FileNotFoundException{
            Scanner lineCounter = new Scanner(inputFile);
            int count = 0;
            
            while(lineCounter.hasNextLine()){
                  lineCounter.nextLine();
                  count++;
            }
            
            lineCounter.close();
            return count;
      }
}