import java.io.File; // Import the File class
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; // Import this class to handle errors

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    try {
      Scanner myReader = new Scanner(new File("numbers.txt"));
      while (myReader.hasNextLine()) {
        arr.add(Integer.parseInt(myReader.nextLine()));
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    for (Integer num : arr) {
      System.out.println(num);
    }
    
  }

  // public static double average(ArrayList<Integer>() arr)


  // public static double standardDeviation(ArrayList<Integer>() arr)


  // public static int mode(ArrayList<Integer> arr)

}
