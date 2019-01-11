package com.stackroute.pe4test;
import com.stackroute.pe4main.ReplaceChars;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReplaceCharsTest {

    ReplaceChars test;

    @Before
    public void setUp() throws Exception {
        test = new ReplaceChars();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void replaceSuccess(){
        String actualresult1 = test.replace("daily dry");
        assertEquals("faity fry",actualresult1);
    }

    @Test
    public void replaceFailure(){
        String actualresult1 = test.replace("daily dry");
        assertNotEquals("daily dry",actualresult1);
    }

    @Test
    public void replaceForNull(){
        String actualresult1 = test.replace(null);
        assertEquals("invalid",actualresult1);
    }
}