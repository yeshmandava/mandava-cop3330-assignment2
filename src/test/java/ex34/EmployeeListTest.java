package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest
{
    EmployeeList empList = new EmployeeList();

    @Test
    void testRemainingEmployees()
    {
        empList.removeEmployee("Chris Jones");
        assertEquals(4,empList.numEmployee);

        empList.removeEmployee("Amanda Cullen");
        assertEquals(3,empList.numEmployee);

        empList.removeEmployee("Jon"); //The expected value should stay the same since the input was invalid.
        assertEquals(3,empList.numEmployee);

    }


}