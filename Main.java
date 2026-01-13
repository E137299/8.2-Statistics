import java.io.File; // Import the File class
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; // Import this class to handle errors


class Main 
{
  public static void main(String[] args) 
  {
    // create an ArrayList to store the integers from the file
    ArrayList<Integer> numbers = new ArrayList<Integer>();


    // read the integers from the file and store them in the 
    try
    {
      Scanner scan= new Scanner(new File("numbers.txt"));
      while (scan.hasNextLine())
      {
        numbers.add(Integer.parseInt(scan.nextLine()));
      }
      scan.close();
    }
    catch (FileNotFoundException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
      return; //Exit if missing file
    }
        double avg = average(numbers);
        double stdDev = standardDeviation(numbers);
        int md = mode(numbers);

        System.out.printf("Average: %.2f%n", avg);
        System.out.printf("Standard Deviation: %.2f%n", stdDev);
        System.out.println("Mode: " + md);
    }

    // Calculate the average using a long for the sum to avoid overflow
public static double average(ArrayList<Integer> numbers) 
{
  if (numbers == null || numbers.isEmpty()) 
  {
    return 0.0;
  }
  long sum = 0;
  for (int number : numbers) 
  {
    sum += number;
  }
  return (double) sum / numbers.size();
  }

  // Calculate the sample standard deviation (divide by n-1)
  public static double standardDeviation(ArrayList<Integer> numbers) 
  {
    if (numbers == null || numbers.size() <= 1) 
    {
      return 0.0;
    }
    double mean = average(numbers);
    double sumSquaredDiff = 0.0;
    for (int number : numbers) 
    {
      double diff = number - mean;
      sumSquaredDiff += diff * diff;
    }
    double variance = sumSquaredDiff / (numbers.size() - 1);
    return Math.sqrt(variance);
  }

    // Find the mode (most frequent value). If ties, return the smallest value.
  public static int mode(ArrayList<Integer> numbers) 
  {
    if (numbers == null || numbers.isEmpty()) 
    {
      return 0;
    }
  // Frequency array: index 0–100 since values are in that range
  int[] freq = new int[101];
  for (int number : numbers) 
  {
    freq[number]++;
  }

  // Find the maximum frequency
  int maxFreq = 0;
  for (int i = 0; i <= 100; i++) 
  {
    if (freq[i] > maxFreq) 
    {
      maxFreq = freq[i];
    }
  }


  for (int i = 0; i <= 100; i++) 
  {
    if (freq[i] == maxFreq) 
    {
      return i;
    }
  }
  return 0; 
  }
}
