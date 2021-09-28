package ex32;


import org.junit.jupiter.api.Test;



class NumberGuessTest
{
    NumberGuess guessGame = new NumberGuess();
    @Test
    void randomNum()
    {
        TestLevel1();
        TestLevel2();
        TestLevel3();

    }
    @Test
    void TestLevel1()
    {
        boolean result;
        int level = 1;
        int randNum = guessGame.RandomNum(level);

        if(randNum>=1 && randNum<=10)
            result = true;
        else
            result = false;

        assert(result);

    }

    @Test
    void TestLevel2()
    {
        boolean result;
        int level = 2;
        int randNum = guessGame.RandomNum(level);

        if(randNum>=1 && randNum<=100)
            result = true;
        else
            result = false;

        assert(result);

    }

    @Test
    void TestLevel3()
    {
        boolean result;
        int level = 3;
        int randNum = guessGame.RandomNum(level);

        if(randNum>=1 && randNum<=1000)
            result = true;
        else
            result = false;

        assert(result);

    }

}