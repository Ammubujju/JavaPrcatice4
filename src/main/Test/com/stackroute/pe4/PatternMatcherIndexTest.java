// Get the start and end index of matched pattern
package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternMatcherIndexTest
{
    PatternMatcherIndex patternmatcherindex;
    String result="";

    @Before
    public void setUp()
    {
        patternmatcherindex=new PatternMatcherIndex();
    }

    @Test
    public void givenInputStringShouldReturnStartEndIndexes()
    {
        result=patternmatcherindex.getMatcherIndex("She sells seashells by the seashore","se");
        //assert
        assertEquals("index is not correct","4-6\n" +  "10-12\n" + "27-29",result);
    }

    @Test
    public void givenInputStringShouldNotReturnStartEndIndexes()
    {
        result=patternmatcherindex.getMatcherIndex("Hello everyone...","z");
        //assert
        assertEquals("index is correct","",result);
    }

    @Test
     public void givenInputNullStringShouldNotReturnStartEndIndexes()
     {
    result=patternmatcherindex.getMatcherIndex("","w");
    //assert
    assertEquals("null input","",result);
     }

    @After
    public void tearDown()
    {
        patternmatcherindex=null;
    }
}