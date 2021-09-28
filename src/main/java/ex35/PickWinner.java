package ex35;
import java.util.Scanner;
import java.util.ArrayList;

public class PickWinner
{
    ArrayList drawList = new ArrayList();

    public void inputNames()
    {
        Scanner input = new Scanner(System.in);
        String name = ".";
        while(!name.isEmpty())
        {
            System.out.print("Enter a name: ");
            name = input.nextLine();
            if(name.isEmpty())
                break;
            drawList.add(name);
        }
    }

    public int randomName()
    {
        return (int)(Math.random()*drawList.size());
    }

    public String winner()
    {
        return drawList.get(randomName()).toString();
    }

}
