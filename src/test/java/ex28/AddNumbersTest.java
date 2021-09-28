package ex28;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddNumbersTest
{
    AddNumbers checkSum = new AddNumbers();

    @Test
    void ValidSum()
    {
        double[] Test = {1,2,3,4,5};
        assertEquals(15,checkSum.findSum(Test,0));
    }

    @Test
    void ValidSum2()
    {
        double[] test = {8,2,7,0,1};
        assertEquals(18, checkSum.findSum(test,0));
    }

}