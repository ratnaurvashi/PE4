package com.stackroute.pe4test;
import com.stackroute.pe4main.SortString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class SortStringTest {

    SortString test;

    @Before
    public void setUp() throws Exception {
        test = new SortString();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void sortStringSuccess(){
        List<String> expectedresult= new ArrayList<>();
        expectedresult.add("a");
        expectedresult.add("a");
        expectedresult.add("expression");
        expectedresult.add("find");
        expectedresult.add("harry");
        expectedresult.add("implementation");
        expectedresult.add("in");
        expectedresult.add("name");
        expectedresult.add("of");
        expectedresult.add("of");
        expectedresult.add("presence");
        expectedresult.add("program");
        expectedresult.add("regular");
        expectedresult.add("string");
        expectedresult.add("the");
        expectedresult.add("the");
        expectedresult.add("the");
        expectedresult.add("to");
        expectedresult.add("with");
        expectedresult.add("write");

        List<String> actualresult = test.sortString("write a program with the implementation of" +
                " regular expression to find the presence of the name harry in a string");
        assertEquals(expectedresult,actualresult);
    }
    @Test
    public void sortStringFailure(){
        List<String> expectedresult= new ArrayList<>();
        expectedresult.add("a");
        expectedresult.add("a");
        expectedresult.add("expression");
        expectedresult.add("find");
        expectedresult.add("harry");
        expectedresult.add("implementation");
        expectedresult.add("in");
        expectedresult.add("name");
        expectedresult.add("of");
        expectedresult.add("of");
        expectedresult.add("presence");
        expectedresult.add("program");
        expectedresult.add("regular");
        expectedresult.add("string");
        expectedresult.add("the");
        expectedresult.add("the");
        expectedresult.add("the");
        expectedresult.add("to");
        expectedresult.add("with");
        expectedresult.add("write");

        List<String> actualresult = test.sortString("write a program with the implementation of" +
                " regular expression to find harry in a string");
        assertNotEquals(expectedresult,actualresult);
    }
    @Test
    public void sortStringNotNull(){
        List<String> expectedresult= new ArrayList<>();
        expectedresult.add("invalid");

        List<String> actualresult = test.sortString(null);
        assertEquals(expectedresult,actualresult);
    }
}