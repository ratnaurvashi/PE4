package com.stackroute.pe4test;
import com.stackroute.pe4main.TransposeString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString test;

    @Before
    public void setUp() throws Exception {
        test = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        test = null;
    }

    @Test
    public void transposeStringSuccess(){
        String actualresult = test.transposeString("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",actualresult);
    }

    @Test
    public void transposeStringFailure(){
        String actualresult = test.transposeString("a quick brown fox jumps over the lazy dog");
        assertNotEquals("a quick brown fox jumps over the lazy dog",actualresult);
    }
}