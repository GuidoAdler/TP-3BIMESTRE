package com.company;

public class compareFunctions
{
    public static int compareTo(int a, int b)
    {
        if(a == b) return 0;
        else if (a < b) return -1;
        else if (a > b) return 1;
        else return 0;

    }

    public static int compareToString(String a, String b){
       return a.compareTo(b);
    }
}
