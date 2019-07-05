package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest
{
    StringTranspose stringtranspose;
    String result="";
    @Before
    public void setUp()
    {
        stringtranspose=new StringTranspose();
    }
    @Test
    public void givenInputStringShouldReturnReversedString()
    {
        result=stringtranspose.stringTranspose("My name is Vishnu");
        //assert
        assertEquals("String is not reversed or trim is not worked", "yM eman si unhsiV",result);
    }
    @Test
    public void givenInputNullStringShouldReturnNull()
    {
        result=stringtranspose.stringTranspose("");
        //assert
        assertEquals("Null String","",result);
    }
    @Test
    public void givenInputAlphaNumericalStringShouldReturnReversedString()
    {
        result=stringtranspose.stringTranspose("ajddj 4729@dj wdjgj");
        //assert
        assertEquals("String is not reversed properly", "jddja jd@9274 jgjdw",result);
    }

    @After
    public void tearDown()
    {
        stringtranspose=null;
    }
}