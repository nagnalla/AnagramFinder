package com.fiveam.interview.test;
import com.fiveamsolutions.interview.AnagramFinderImpl;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by nnala on 10/9/16.
 */
public class AnagramFinderTest {
    /**Best Case Scenario and it doesn't need to perform Algorithm*/
    @Test
    public void testNormalAnagrams() {
        AnagramFinderImpl anagramFinderObj = new AnagramFinderImpl();
        boolean inputNormalAnagrams = anagramFinderObj.areAnagrams("aba", "aba");
        assertTrue("true", inputNormalAnagrams);
    }
    @Test
    public void testAnagramsWithWhiteSpaces() {
        AnagramFinderImpl anagramFinderObj = new AnagramFinderImpl();
        boolean result = anagramFinderObj.areAnagrams("ZZYZX", "X Y Z ZZ" );
        assertTrue("true",result);

    }

    @Test
    public void testAnagramsWithDashes() {
        AnagramFinderImpl anagramFinderObj = new AnagramFinderImpl();
        boolean result = anagramFinderObj.areAnagrams("ZZY-ZX", "- X Y Z ZZ" );
        assertTrue("true",result);

    }


    @Test
    public void testAnagrams() {
        AnagramFinderImpl anagramFinderObj = new AnagramFinderImpl();
        boolean result = anagramFinderObj.areAnagrams("pOstMaster", "stamp store");
        assertTrue("true",result);

    }
    @Test
    public void testNonAnagrams() {
        AnagramFinderImpl anagramFinderObj = new AnagramFinderImpl();
        boolean result = anagramFinderObj.areAnagrams("ZZYZX", "X Y Z ZZz" );
        assertFalse("true",result);

    }


}
