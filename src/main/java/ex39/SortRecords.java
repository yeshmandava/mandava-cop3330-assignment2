package ex39;
import java.util.Comparator;

public class SortRecords
{
    public String firstName;
    public String lastName;
    public String position;
    public String date;

    public SortRecords initEmployee(String firstName,String lastName,String position,String date){
        SortRecords Employee=new SortRecords();
        Employee.firstName=firstName;
        Employee.lastName=lastName;
        Employee.position=position;
        Employee.date=date;
        return Employee;
    }


    public static Comparator<SortRecords> SEPERATE_BY_NAME = new Comparator<SortRecords>() {
        public int compare(SortRecords one, SortRecords other) {
            return one.lastName.compareTo(other.lastName);
        }
    };

    public String toString(){
        return (firstName+" "+lastName+"\t\t\t\t|"+position+"\t\t\t\t\t|"+date+"\n");

    }
}
