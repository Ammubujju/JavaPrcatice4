package com.stackroute.pe4;

import java.util.Arrays;

public class StringSorting
{
    public String[] stringSort(String input)
    {
        String words[] = input.split(" ");

        for (int i = 0; i < words.length; i++)
        {
            for (int j=0; j <words.length-1; j++)      // Sorting each word
            {
                if(words[j].compareTo(words[j+1])>0)
                {
                    String temp=words[j];
                    words[j]=words[j+1];
                    words[j+1]=temp;
                }
            }

        }
        return words;
    }
}