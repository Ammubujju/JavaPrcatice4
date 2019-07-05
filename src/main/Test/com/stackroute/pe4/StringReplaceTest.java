// Replacing a particular characters in String
package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReplaceTest
{
    StringReplace stringreplace;
    String result="";

    @Before
    public void setUp()
    {
        stringreplace=new StringReplace();
    }

    @Test
    public void givenInputStringShouldReturnReplacedCharacters()
    {
        result = stringreplace.checkReplaceString("daily dry");
        //assert
        assertEquals("characters are  replaced properly","faity fry",result);
    }

    @Test
    public void givenInputStringShouldNotReturnReplacedCharacters()
    {
        result=stringreplace.checkReplaceString("aaaa");
        //assert
        assertEquals("characters are not to be replaced","aaaa",result);
    }

    @Test
    public void givenInputStringShouldNotReturnCharacters()
    {
        result = stringreplace.checkReplaceString("baby is crying");
        //assert
        assertEquals("characters are not to be replaced", "baby is crying", result);
    }
    @After
    public void tearDown()
    {
        stringreplace=null;
    }
}
