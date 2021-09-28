package ex37;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CreatePassword
{
    ArrayList<Character> passwordList = new ArrayList<Character>();
    private static char[] Specials = {'!','@','#','$','%','^','&','*','(',')'};
    private static String Numbers = "1234567890";
    private static String Letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String formPassword(int numSpecial,int numNumbers,int numLetters)
    {
        createSpecials(numSpecial);
        createNumbers(numNumbers);
        createLetters(numLetters);

        String finalPass = "";
        for(int i=0;i<passwordList.size();i++)
        {
            finalPass += passwordList.get(i);
        }
        return finalPass;
    }


    private char randomSpecial()
    {
        int random =(int)(Math.random()*Specials.length);
        return Specials[random];
    }
    private char randomNumbers()
    {
        int random = (int)(Math.random()*Numbers.length());
        return Numbers.charAt(random);
    }
    private char randomLetters()
    {
        int random = (int)(Math.random()*Letters.length());
        return Letters.charAt(random);
    }
    public void createSpecials(int num)
    {
        for(int i =0;i<num;i++)
        {
            passwordList.add(randomSpecial());
        }
    }

    public void createNumbers(int num)
    {
        for(int i=0;i<num;i++)
        {
            passwordList.add(randomNumbers());
        }
    }
    public void createLetters(int num)
    {
        for(int i=0;i<num;i++)
        {
            passwordList.add(randomLetters());
        }
    }

}
