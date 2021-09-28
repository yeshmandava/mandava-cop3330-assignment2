package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest
{
    HeartRate heartTest = new HeartRate();
    @Test
    void calcHR()
    {
        assertEquals(138,heartTest.CalculateHR(22,65,55));
        assertEquals(151,heartTest.CalculateHR(22,65,65));
        assertEquals(178,heartTest.CalculateHR(22,65,85));
        assertEquals(191,heartTest.CalculateHR(22,65,95));
    }

}