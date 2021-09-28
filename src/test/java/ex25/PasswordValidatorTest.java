package ex25;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class PasswordValidatorTest
{
    PasswordValidator passwordValid = new PasswordValidator();

    @Test
    void CheckVeryWeak()
    {
        //PasswordValidator passwordValid = new PasswordValidator();
        assertEquals(0,passwordValid.PasswordStrength("134567"));
    }
    @Test
    void CheckWeak()
    {
        assertEquals(1,passwordValid.PasswordStrength("abej112"));
    }
    @Test
    void CheckStrong()
    {
        assertEquals(2,passwordValid.PasswordStrength("asd747sefk"));
    }
    @Test
    void CheckVeryStrong()
    {
        assertEquals(3,passwordValid.PasswordStrength("724!!ghwf@d"));
    }

}