import org.example.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTests {
    Main sut;

    @BeforeEach
    public void beforeEach() {
        System.out.println("before each test");
        sut = new Main();
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each test");
        sut = null;
    }

    @Test
    public void testMain() {
        System.out.println("test main");
        final String original = "Alibaba or Alibubab? ";
        final String argument = "I do not know!";
        final String expected = "Alibaba or Alibubab? I do not know!";
        final String resul = original.concat(argument);
        assertEquals(expected, resul);
    }

    @Test
    public void testMain_Concat_emptyString_originalString() {
        System.out.println("test main");
        final String original = "Alibaba or Alibubab?";
        final String argument = " ";
        final String result = original.concat(argument);
        assertNotEquals(original, result);
    }

    @Test
    public void testStarPosition() {
        System.out.println("test starPosition");
        final String original = "Alibaba or Alibubab? I do not know!";
        assertTrue(original.contains("bab"));
        assertTrue(original.contains("bub"));
    }

}
