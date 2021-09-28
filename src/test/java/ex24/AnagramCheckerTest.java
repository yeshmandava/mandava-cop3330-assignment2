package ex24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AnagramCheckerTest
{
    @Test
    @DisplayName("Words are anagrams")
    void isAnagramReturnTrue() {
        AnagramChecker anagram=new AnagramChecker();

        boolean expected=true;
        boolean actual=anagram.isAnagram("race","care");

        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Words aren't anagrams")
    void isAnagramReturnFalse() {
        AnagramChecker anagram=new AnagramChecker();

        boolean expected=false;
        boolean actual=anagram.isAnagram("Balloon","Balance");

        assertEquals(expected,actual);
    }

}