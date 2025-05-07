////////////////////////////////////////////////////////////////////
// Davide Testolin 2079242
// Filippo Guerra 2077681
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;

public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void invalidArgumentTest() {
        App.main(new String[]{"123", "321"});
        assertEquals("Usage: java -jar roman-number-1.0-SNAPSHOT.jar <number>\n", errContent.toString());
    }

    @Test
    public void appUsageTest() {
        String result = "  _____   __  __   __   __   _____   _____   __   __ \n" +
                    " / ____| |  \\/  |  \\ \\ / /  / ____| |_   _|  \\ \\ / / \n" + 
                    "| |      | \\  / |   \\ V /  | |        | |     \\ V /  \n"+
                    "| |      | |\\/| |    > <   | |        | |      > <   \n"+
                    "| |____  | |  | |   / . \\  | |____   _| |_    / . \\  \n"+
                    " \\_____| |_|  |_|  /_/ \\_\\  \\_____| |_____|  /_/ \\_\\ \n\n";
        App.main(new String[]{"999"});
        assertEquals(result, outContent.toString());
    }
}
