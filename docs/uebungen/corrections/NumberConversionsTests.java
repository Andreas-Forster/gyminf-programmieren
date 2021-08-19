
import edu.illinois.cs.cs125.gradlegrader.annotations.Graded;
import edu.illinois.cs.cs125.gradlegrader.annotations.Tag;
import org.junit.Test;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;


public class NumberConversionsTests {


    @Test(timeout = 1000)
    @Graded(points = 1)
    @Tag(name = "difficulty", value = "simple")
    @Tag(name = "function", value = "dec2HexOneDigit")
    public void testDec2HexOneDigit() {
       assertEquals("0x0", NumberConversions.decToHex(0).toLowerCase());
       assertEquals("0x7", NumberConversions.decToHex(7).toLowerCase());
       assertEquals( "0xA", NumberConversions.decToHex(10).toLowerCase());
       assertEquals( "0xF", NumberConversions.decToHex(15).toLowerCase());
    }


    @Test(timeout = 1000)
    @Graded(points = 1)
    @Tag(name = "difficulty", value = "simple")
    @Tag(name = "function", value = "dec2HexMultipleDigits")
    public void testDec2HexMultipleDigits() {

        assertEquals("0x6B", NumberConversions.decToHex(107).toLowerCase());
        assertEquals("0xFE", NumberConversions.decToHex(254).toLowerCase());
        assertEquals("0xFFFF", NumberConversions.decToHex(65535).toLowerCase());


    }
        

    @Test(timeout = 1000)
    @Graded(points = 1)
    @Tag(name = "difficulty", value = "simple")
    @Tag(name = "function", value = "bin2DecOneDigig")
    public void testbin2DecOneDigit() {
        assertEquals(0, NumberConversions.binToDec("0b0"));
        assertEquals(1, NumberConversions.binToDec("0b1"));
    }
    @Test(timeout = 1000)
    @Graded(points = 1)
    @Tag(name = "difficulty", value = "simple")
    @Tag(name = "function", value = "bin2DecSeveralDigits")
    public void testbin2DecSeveralDigits() {

        assertEquals(7, NumberConversions.binToDec("0b000111"));
        assertEquals(16, NumberConversions.binToDec("0b10000"));
        assertEquals(7, NumberConversions.binToDec("0b111"));



    }
        
}
