////////////////////////////////////////////////////////////////////
// Davide Testolin 2079242
// Filippo Guerra 2077681
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class IntegerToRomanTest {
    IntegerToRoman integerToRoman;

    @Before
    public void setUp() {
        integerToRoman = new IntegerToRoman();
    }

    @Test
    public void conversionTest() {
        assertEquals("III", IntegerToRoman.convert(3));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XIX", IntegerToRoman.convert(19));
        assertEquals("XXXVII", IntegerToRoman.convert(37));
        assertEquals("XLIX", IntegerToRoman.convert(49));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("LV", IntegerToRoman.convert(55));
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("CXXIII", IntegerToRoman.convert(123));
        assertEquals("DCCCXLV", IntegerToRoman.convert(845));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    public void outOfRangeTest() {
        assertNull(IntegerToRoman.convert(-1));
        assertNull(IntegerToRoman.convert(0));
        assertNull(IntegerToRoman.convert(1001));
    }
}
