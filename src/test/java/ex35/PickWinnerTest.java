package ex35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class PickWinnerTest
{
    PickWinner chooseWinner = new PickWinner();

    @Test
    void Winner()
    {
        ArrayList drawList = new ArrayList();
        drawList.add("Yesh");
        drawList.add("Bill");
        drawList.add("James");
        drawList.add("Jose");

        int num = chooseWinner.randomName();
        String person = drawList.get(num).toString();

        Assertions.assertEquals(true, drawList.contains(person));


    }

}