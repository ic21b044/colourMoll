package at.sml.colour.model;

import at.sml.colour.service.colourService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class colourTest {

    private final colourService clrTest = new colourService();

    /*Initial Test*/
    @Test
    void testgetComp() {
        String testcolour = clrTest.getComColour("red");
        testcolour.equals("green");
    }

    @Test
    void testgetcolour() {
        String testcolour = clrTest.getColour("red");
        testcolour.equals("red");
    }

}
