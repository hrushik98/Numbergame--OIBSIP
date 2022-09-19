import java.util.Random; 
import java.util.*;
public class Main
{   
public static void main(String args[])   
{   
// creating an object of Random class   
Random random = new Random();   
// Generates random integers 0 to 49  
int x = random.nextInt(50); 
Scanner sc = new Scanner(System.in);
System.out.println("enter a number between 1 and 50");
int y = sc.nextInt(); 
if (y>x){
    System.out.println("The number is greater than the required number");
}
if(y<x){
    System.out.println("The number is lesser than the required number");
    
}
if (y==x){
    System.out.println("the number is equal to the required number");
}
}
}
