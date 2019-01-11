package com.stackroute.pe4test;
import com.stackroute.pe4main.PresenceOfHarry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PresenceOfHarryTest {

    PresenceOfHarry test;

    @Before
    public void setUp() throws Exception {
        test = new PresenceOfHarry();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void checkPresenceSuccess(){
        boolean actualresult =test.checkPresence("This is Harry.");
        assertEquals(true,actualresult);
    }

    @Test
    public void checkPresenceFailure(){
        boolean actualresult =test.checkPresence("This is Henry.");
        assertNotEquals(true,actualresult);
    }

    @Test
    public void checkPresenceForNull(){
        boolean actualresult =test.checkPresence(null);
        assertEquals(false,actualresult);
    }
}