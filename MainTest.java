import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.*;

public class MainTest{
    @Test
    public void testAverage(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        double result = Main.average(arr);
        Assert.assertEquals(3.6666666666666665, result,0.0001);
    }

    @Test
    public void testStandardDeviation(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        double result = Main.standardDeviation(arr);
        Assert.assertEquals(1.2909944487358056, result,0.05);

    }

        @Test
    public void testMode(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        int result = Main.mode(arr);
        Assert.assertEquals(5, result);

    }
}
