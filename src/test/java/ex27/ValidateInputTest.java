package ex27;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ValidateInputTest
{
    ValidateInput checkInputs = new ValidateInput();

    @Test
    void ValidFirstName()
    {
        assertEquals(true,checkInputs.checkFirstName("Yesh"));
        assertEquals(false, checkInputs.checkFirstName("J"));
    }
    @Test
    void ValidLastName()
    {
        assertEquals(true, checkInputs.checkLastName("Mandava"));
        assertEquals(false, checkInputs.checkLastName(""));
    }
    @Test
    void ValidZipCode()
    {
        assertEquals(true,checkInputs.checkZipCode("33223"));
        assertEquals(false, checkInputs.checkZipCode("ABC"));
    }
    @Test
    void ValidEmployeeId()
    {
        assertEquals(true, checkInputs.checkEmployeeID("TK-6537"));
        assertEquals(false, checkInputs.checkEmployeeID("A12-1234"));
    }


}