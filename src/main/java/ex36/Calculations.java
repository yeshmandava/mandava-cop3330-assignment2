package ex36;
import java.util.ArrayList;


public class Calculations
{
    public double Mean(ArrayList<Double> numbers)
    {
        double sum = 0;
        for(int i = 0;i < numbers.size();i++)
        {
            sum += numbers.get(i);
        }
        return (sum/numbers.size());
    }

    public double Minimum (ArrayList<Double>numbers)
    {
        double minimum = numbers.get(0);
        for(int i=0;i<numbers.size();i++)
        {
            if(numbers.get(i)<minimum)
            {
                minimum = numbers.get(i);
            }
        }
        return minimum;
    }

    public double Maximum (ArrayList<Double>numbers)
    {
        double maximum = numbers.get(0);
        for(int i=0;i<numbers.size();i++)
        {
            if(numbers.get(i)>maximum)
            {
                maximum = numbers.get(i);
            }
        }
        return maximum;
    }

    public double StandardDev(ArrayList<Double> numbers)
    {
        ArrayList stdList = new ArrayList();
        for(int i =0;i<numbers.size();i++)
        {
            double power = Math.pow(numbers.get(i)-Mean(numbers),2);
            stdList.add(power);
        }


        double finalResult = Math.sqrt(Mean(stdList));
        return Math.ceil(finalResult*100)/100;
    }

}
