// Finding particular string is matched using Regular Expressions
package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternMatchingTest
{
    PatternMatching patternmatching;
    boolean result;
    @Before
    public void setUp()
    {
        patternmatching=new PatternMatching();
    }
    @Test
    public void givenInputStringShouldReturnPatternIsMatched()
    {
        result=patternmatching.checkPatternMatch("This is Harry","Harry");
        //assert
        assertEquals("pattern is not matched",true,result);
    }
    @Test
    public void givenInputStringShouldNotReturnPatternMatched()
    {
        result=patternmatching.checkPatternMatch("gfeuiuw63448274974269","A");
        //assert
        assertEquals("pattern is not matched",false,result);
    }
    @Test
    public void givenInputStringShouldReturnPatternMatched()
    {
        result=patternmatching.checkPatternMatch("gfeuiuw6344827497@@@4269","@");
        //assert
        assertEquals("pattern is not matched",true,result);
    }
    @After
    public void tearDown()
    {
        patternmatching=null;
    }
}