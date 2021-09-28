package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest
{
    Calculations compute = new Calculations();

    @Test
    void calcMean()
    {
        ArrayList<Double> num = new ArrayList<Double>();
        num.add(100.0);
        num.add(200.0);
        num.add(1000.0);
        num.add(300.0);
        assertEquals(400,compute.Mean(num));

    }

    @Test
    void calcMin()
    {

        ArrayList<Double> num = new ArrayList<Double>();
        num.add(100.0);
        num.add(200.0);
        num.add(1000.0);
        num.add(300.0);
        assertEquals(100,compute.Minimum(num));

    }

    @Test
    void calcMax()
    {
        ArrayList<Double> num = new ArrayList<Double>();
        num.add(100.0);
        num.add(200.0);
        num.add(1000.0);
        num.add(300.0);
        assertEquals(1000,compute.Maximum(num));

    }

    @Test
    void calcStd()
    {
        ArrayList<Double> num = new ArrayList<Double>();
        num.add(100.0);
        num.add(200.0);
        num.add(1000.0);
        num.add(300.0);
        assertEquals(353.56,compute.StandardDev(num));

    }
}