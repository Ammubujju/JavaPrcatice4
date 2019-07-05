package com.stackroute.pe4;

public class StringTranspose
{
    // Variables Declaration
    String word="",reverseword="",reversedstring="";

    public String stringTranspose(String input)
    {
        String words[] = input.split(" ");         // Splitting given string into words

        for (int i = 0; i < words.length; i++)
        {
            word = words[i];
            reverseword = "";
            for (int j = word.length()-1; j >= 0; j--)
            {

                reverseword = reverseword + word.charAt(j);   // Reversing each word
            }
            reversedstring = reversedstring + reverseword + " ";
        }
        return reversedstring.trim();
    }
}