package ex39;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Yeshwanth Mandava
 */
public class FinalSort
{
    public static void main( String[] args )
    {

        SortRecords employee=new SortRecords();
        ArrayList employeeList=new ArrayList<SortRecords>();

        Map<Integer,SortRecords> SortMap=new  HashMap<Integer,SortRecords>();


        employeeList.add(employee.initEmployee("John","Johnson","Manager","2016-12-31"));
        employeeList.add(employee.initEmployee("Tou","Xiong","Software Engineer","2016-10-05"));
        employeeList.add(employee.initEmployee("Michaela","Michaelson","District Manager","2015-12-19"));
        employeeList.add(employee.initEmployee("Jake","Jacobson","Programmer",""));
        employeeList.add(employee.initEmployee("Jacquelyn","Jackson","DBA",""));
        employeeList.add(employee.initEmployee("Sally","Webber","Web Developer","2015-12-18"));


        Collections.sort(employeeList,SortRecords.SEPERATE_BY_NAME);


        for(int i=0;i<employeeList.size();i++){
            SortRecords temp =(SortRecords) employeeList.get(i);
            SortMap.put(i,temp);
        }

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("---------------------------------------------------------");
        Set<Integer> Keys = SortMap.keySet();
        for(Integer key : Keys){
            System.out.print( SortMap.get(key) );
        }
    }
}

