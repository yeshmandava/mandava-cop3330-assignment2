package ex34;

public class EmployeeList
{
    public String[] Employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen","Jeremy Goodwin"};
    int numEmployee = 5;

    public void removeEmployee(String employeeName)
    {
        for(int i=0;i<Employees.length;i++)
        {
            if(Employees[i].equalsIgnoreCase(employeeName))
            {
                Employees[i] = "";
                numEmployee--;
            }
        }
    }

    public String printEmployee()
    {
        System.out.printf("There are %d employees.\n",numEmployee);
        String employeeList = "";

        for(int i=0;i<Employees.length;i++)
        {
            if(!Employees[i].equals(""))
            {
                employeeList+=Employees[i]+"\n";
            }
        }
        return employeeList;
    }


}
