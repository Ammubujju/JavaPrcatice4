package com.stackroute.pe4;

public class CharacterCount
{
    // Initialisation
    int inputstringlength,output;
    String replacedstring="";

    public int countCharacter(String input)
    {
        inputstringlength=input.length();     // Finds the input String length
        replacedstring=input.replace("a","");   // Replacing the target String with null
        int replacedlength=replacedstring.length();
        output=inputstringlength-replacedlength;
        return output;

    }
}
