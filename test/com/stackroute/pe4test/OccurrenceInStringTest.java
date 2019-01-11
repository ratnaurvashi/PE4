package com.stackroute.pe4test;
import com.stackroute.pe4main.OccurrenceInString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OccurrenceInStringTest {

    OccurrenceInString test;

    @Before
    public void setUp() throws Exception {
        test = new OccurrenceInString();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void checkCountOccurrencesSuccess(){
        int actualresult = test.countOccurrence("Java is java again java again","a");
        assertEquals(10,actualresult);
    }

    @Test
    public void checkCountOccurrencesFailure(){
        int actualresult = test.countOccurrence("Java is java again java again","a");
        assertNotEquals(4,actualresult);
    }

    @Test
    public void checkCountOccurrencesForNull(){
        int actualresult1 = test.countOccurrence(null,"a");
        assertEquals(0,actualresult1);

        int actualresult2 = test.countOccurrence("Java is java again java again",null);
        assertEquals(0,actualresult2);
    }
}