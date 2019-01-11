package com.stackroute.pe4test;
import com.stackroute.pe4main.MultipleOccurrence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class MultipleOccurrenceTest {

    MultipleOccurrence test;

    @Before
    public void setUp() throws Exception {
        test = new MultipleOccurrence();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void findOccurrenceSuccess(){
        List<String> expectedresult = new ArrayList<>();
        expectedresult.add("4");
        expectedresult.add("-");
        expectedresult.add("6");
        expectedresult.add("10");
        expectedresult.add("-");
        expectedresult.add("12");
        expectedresult.add("27");
        expectedresult.add("-");
        expectedresult.add("29");
        List<String> actualresult = test.findOccurrence("She sells seashells by the seashore","se");
        assertEquals(expectedresult,actualresult);
    }

    @Test
    public void findOccurrenceFailure(){
        List<String> expectedresult = new ArrayList<>();
        expectedresult.add("4");
        expectedresult.add("-");
        expectedresult.add("6");
        expectedresult.add("10");
        expectedresult.add("-");
        expectedresult.add("12");
        expectedresult.add("27");
        expectedresult.add("-");
        expectedresult.add("29");
        List<String> actualresult = test.findOccurrence("She sells seashells by the seashore","abb");
        assertNotEquals(expectedresult,actualresult);
    }

    @Test
    public void findOccurrenceForNull(){
        List<String> expectedresult = new ArrayList<>();
        expectedresult.add("invalid");
        List<String> actualresult = test.findOccurrence(null,"abb");
        assertEquals(expectedresult,actualresult);

        List<String> actualresult2 = test.findOccurrence("She sells seashells by the seashore",null);
        assertEquals(expectedresult,actualresult2);
    }
}