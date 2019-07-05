package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherIndex
{
    // Initialisation
    int start,end;
    String output="";

    public String  getMatcherIndex(String input,String find)
    {
        Pattern pattern=Pattern.compile(find);
        Matcher matcher=pattern.matcher(input);
        while(matcher.find())
        {
            start=matcher.start();      // Start Index is taken if found
            end=matcher.end();         //  End Index of the specified string
            output+=start +"-"+end+ "\n";
        }
        return output.trim();         // Extra space is added at last in output
    }
}