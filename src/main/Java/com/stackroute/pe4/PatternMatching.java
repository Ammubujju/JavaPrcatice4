package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching
{
    public boolean checkPatternMatch(String input,String findword)
    {
        Pattern pattern=Pattern.compile(findword);   // Patterns and Matchers are used in regex
        Matcher matcher=pattern.matcher(input);
        boolean output=matcher.find();   // Returns boolean value if pattern is found
        return output;
    }
}