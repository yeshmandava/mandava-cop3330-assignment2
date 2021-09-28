package ex26;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CreditCardTest {
    CreditCard numMonths = new CreditCard();
    @Test
    void checkMonths()
    {
        assertEquals(70,numMonths.calculateMonthsUntilPaidOff((12/100f)/365,5000,100));
    }

    @Test
    void checkMonths2()
    {
        assertEquals(23,numMonths.calculateMonthsUntilPaidOff((13/100f)/365,4800,240));

    }
}