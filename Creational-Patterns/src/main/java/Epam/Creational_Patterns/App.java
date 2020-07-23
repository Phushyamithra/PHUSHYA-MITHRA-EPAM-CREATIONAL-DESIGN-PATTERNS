package Epam.Creational_Patterns;

import java.util.Scanner;

public class App 
{
    public static void main( String args[] )
    {
        String val = " ";
        Scanner in = new Scanner(System.in);
        val=in.nextLine();
        types con = new types();
        headphones call = con.getInstance(val);
        call.printModel();
        
    }
}
