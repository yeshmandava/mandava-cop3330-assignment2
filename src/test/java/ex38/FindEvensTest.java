package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindEvensTest
{
    @Test
    void checkForEvens()
    {
        int[] numList = {1,2,3,4,5,6,7,8};
        int[] numList2 = {1,3,5,9};
        FindEvens Evens = new FindEvens();
        int[] finalList = Evens.findEvens(numList);
        int[] finalList2 = Evens.findEvens(numList2);
        assertEquals(4,finalList.length);
        assertEquals(0,finalList2.length);
    }

}