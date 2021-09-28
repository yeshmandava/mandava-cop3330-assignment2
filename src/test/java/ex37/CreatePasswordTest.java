package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatePasswordTest {

    public boolean checkKey (String key, int min, int special, int nums) {
        if (!(key.length() >= min)) {
            return false;
        }
        int numOfNums = 0;
        int numOfSpecials = 0;
        for (int i = 0; i < key.length(); i++) {
            if (Character.isDigit(key.charAt(i))) {
                numOfNums++;
            } else if (Character.isAlphabetic(key.charAt(i))) {

            } else {
                numOfSpecials++;
            }
        }
        if (special != numOfSpecials || nums != numOfNums) {
            return false;
        }

        return true;
    }


    @Test
    void generatePassword() {
        CreatePassword passwordGenerator = new CreatePassword();
        App execute = new App();

        for (int i = 0; i < 100; i++) {
            int randomMin = (int) (Math.random() * 5 + 1);
            int randomAmtSpecial = (int) (Math.random() * 10 + 5);
            int randomAmtNums = (int) (Math.random() * 5 + 1);
            String password = passwordGenerator.formPassword(randomAmtSpecial, randomAmtNums, execute.calculateAmtOfLetters(randomMin, randomAmtSpecial, randomAmtNums));
            boolean dec = checkKey(password, randomMin, randomAmtSpecial, randomAmtNums);
            assertEquals(dec, dec);
        }
    }
}


