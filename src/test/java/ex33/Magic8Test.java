package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8Test
{
    RandomPhrase MagicBall = new RandomPhrase();

    @Test
    void testRandNum() //Checks to see if ransom number generator works
    {
        int rand = MagicBall.randomNumber();
        boolean num;

        if(rand>=1 && rand<=4)
        {
            num = true;
        }
        else
            num = false;

        assert(num);
    }

    @Test
    void testRandAns() //Checks to see if random phrase generator works
    {
        String ans = MagicBall.generatePhrase();
        boolean res;

        if(ans.equals("Yes") || ans.equals("No") || ans.equals("Maybe") || ans.equals("Ask again later"))
        {
            res = true;
        }
        else
            res = false;

        assert(res);
    }

}