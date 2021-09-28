package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadInputTest
{
    BadInput testInput = new BadInput();

    @Test
    void Input()
    {
        assertEquals(18, testInput.calcRate(4));
    }

    @Test
    void Input2()
    {
        assertEquals(6, testInput.calcRate(12));
    }


}