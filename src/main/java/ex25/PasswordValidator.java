package ex25;

public class PasswordValidator {
    public int PasswordStrength(String Password) {
        if (Password.length() < 8) {
            boolean num = true;
            for (int i = 0; i < Password.length(); i++) {
                if (!Character.isDigit(Password.charAt(i))) {
                    num = false;
                }
            }

            if (num == true) {
                return 0;
            } else {
                return 1;
            }
        }

        int Num = 0;
        int letter = 0;
        int specialChar = 0;

        for (int i = 0; i < Password.length(); i++) {
            if (Character.isDigit(Password.charAt(i))) {
                Num++;
            } else if (Character.isAlphabetic(Password.charAt(i))) {
                letter++;
            } else {
                specialChar++;
            }
        }

        if (Password.length()>= 8 && Num > 0 && letter > 0 && specialChar > 0)
        {
            return 3;
        }
        else
        {
            return 2;
        }
    }
}
