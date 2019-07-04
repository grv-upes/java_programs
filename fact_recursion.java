import java.util.Scanner;

class Main{  
 static int factorial(int n){    
  
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1)); 
    
  }   
 
 public static void main(String args[]){  
    int number;
    Scanner obj = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    number = obj.nextInt();
      
    int fact = factorial(number);   
  
    System.out.println("Factorial of "+number+" is: "+fact);    
  }  
} 
