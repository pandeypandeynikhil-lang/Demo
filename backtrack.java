package Demo;

import java.io.StringReader;
import java.util.Scanner;
public class backtrack
{
    public static void printPermutation(String str, String perm, int index)
    {
        if(str.length()==0)
        {
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++)
        {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i)+ str.substring(i+1);
            printPermutation(newString,perm+currentChar,index+1);
        }
    }
    public static void main(String[] args)
    {
        String str;
        String perm = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you wish to manipulate");
        str = sc.nextLine();
        printPermutation(str, perm, 0);
    }
}