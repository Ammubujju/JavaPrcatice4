package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringSortingTest
{
    StringSorting stringsorting;
    String[] result;

    @Before
    public void setUp()
    {
        stringsorting=new StringSorting();
    }
    @Test
    public void givenInputStringShouldReturnStringSortedInAscendingOrder()
    {
        String[] comparision = {"is","my","name"};
        result=stringsorting.stringSort("my name is");
        //assert
        assertArrayEquals(comparision,result);
    }
    @Test
    public void givenInputStringShouldReturnSortedInAscendingOrder() {
        String[] comparision = {"hello", "hiii", "sir"};
        result = stringsorting.stringSort("hiii hello sir");
        //assert
        assertArrayEquals(comparision, result);
    }
    @Test
    public void givenInputAlphabetStringShouldReturnSortedInAscendingOrder() {
        String[] comparision = {"3628718", "735723", "86213824"};
        result = stringsorting.stringSort("735723 3628718 86213824");
        //assert
        assertArrayEquals(comparision, result);
    }
    @After
    public void tearDown()
    {
        stringsorting = null;
    }
}