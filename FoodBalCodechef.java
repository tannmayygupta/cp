import java.util.*;
import java.lang.*;
import java.io.*;

public class FoodBalCodechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc =  new Scanner(System.in);
        int F1 = sc.nextInt();
        int P1 = sc.nextInt();
        int F2 = sc.nextInt();
        int P2 = sc.nextInt();
        
        int first = Math.abs(F1 - P1);
        
        int second = Math.abs(F2 - P2);
        
        if(first < second){
            System.out.println("First");
        }
        else if(first > second){
            System.out.println("Second");
        }
        else{
            System.out.println("Both");
        }
	}
}
