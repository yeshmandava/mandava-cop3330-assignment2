package ex40;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class SearchRecords
{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        SortRecords employee=new SortRecords();
        ArrayList employeeArrayList=new ArrayList<SortRecords>();
        employeeArrayList.add(employee.initEmployee("John","Johnson","Manager","2016-12-31"));
        employeeArrayList.add(employee.initEmployee("Tou","Xiong","Software Engineer","2016-10-05"));
        employeeArrayList.add(employee.initEmployee("Michaela","Michaelson","District Manager","2015-12-19"));
        employeeArrayList.add(employee.initEmployee("Jake","Jacobson","Programmer",""));
        employeeArrayList.add(employee.initEmployee("Jacquelyn","Jackson","DBA",""));
        employeeArrayList.add(employee.initEmployee("Sally","Webber","Web Developer","2015-12-18"));

        Map<Integer,SortRecords> SortMap=new HashMap<Integer,SortRecords>();

        for(int i=0;i<employeeArrayList.size();i++){
            SortRecords temp =(SortRecords) employeeArrayList.get(i);
            SortMap.put(i,temp);
        }
        System.out.println("Enter a search string: ");
        String str=in.next();


        System.out.println("Name                | Position          | Separation Date");
        System.out.println("---------------------------------------------------------");
        Set<Integer> Key = SortMap.keySet();
        for(Integer key : Key){
            if(SortMap.get(key).lastName.substring(0,str.length()).equals(str) || SortMap.get(key).firstName.substring(0,str.length()).equals(str)) {
                System.out.print(SortMap.get(key));
            }
            //Yooo whats upo this is new edit
        }
    }
}
