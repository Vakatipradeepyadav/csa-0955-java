import java.util.Scanner;  
public class perfect 
{  
    public static void main(String args[])    
    {  
        long a;
        long sum = 0;
        int i = 1; 
        Scanner reader = new Scanner(System.in);         
        System.out.print("Enter the number : ");  
        a = reader.nextLong();  
        while(i <= a/2)  
        {  
            if(a % i == 0)  
            {   
                sum = sum + i;  
            }  
            i++;  
        } 
        if(sum == a)  
        {    
            System.out.println(a + " is a perfect number.");  
        } 
        else   
            System.out.println(a + " is not a perfect number.");   
    }  
}