package com.stackroute.pe4;

public class StringReplace
{
    // Variables Declaration
    String input="",output="";

    public String checkReplaceString(String input)
    {

        output=input.replace('d','f');    // Replacing 'd' with 'f'
        output=output.replace('l','t');

        return output;
    }
}