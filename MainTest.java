import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.*;

public class MainTest{
    @Test
    public void testAverage(){
        int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        double result = Main.average(arr);
        Assert.assertEquals(3.6666666666666665, result,0.0001);
    }

    @Test
    public void testStandardDeviation(){
        int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        double result = Main.standardDeviation(arr);
        Assert.assertEquals(1.2909944487358056, result,0.05);

    }

        @Test
    public void testMode(){
        int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int result = Main.mode(arr);
        Assert.assertEquals(5, result);

    }
}
