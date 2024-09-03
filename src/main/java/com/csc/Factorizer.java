package com.csc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factorizer
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);    
    System.out.print("Please enter number ");
    int input_integer = in.nextInt(); 
  /* 
    if (isPrime(input_integer)) 
    {
      System.out.println(input_integer + " is a prime number.");
    }
    else 
    {
      System.out.println(input_integer + " is not a prime number.");
    }
*/
int [] Prime_Factors=Factorize(input_integer);
for (int k=0; k<100; k++)
{
  if (Prime_Factors[k]!=0)
  {
    System.out.println(Prime_Factors[k]);
  }
  
}

    in.close(); 
  }
  public static boolean isPrime(int input_integer) 
  {
    if (input_integer <= 1) 
    {
      return false; 
    }
    else if (input_integer==2)
    {
      return true;
    }
    for (int i = 2; i <= input_integer/2; i++) 
    {
      if (input_integer % i == 0) 
      {
        return false; 
      }
    }
    return true; 
  }





public static int[] Factorize(int input_integer)
{
  int[] Prime_Factors= new int [100];
  List<Integer> two_to_input = new ArrayList <>();
  int current_prime_factor_index=0;
  for (int j=2; j<=input_integer;j++)
  
  {
    two_to_input.add(j);
    
    
  }
  
  for (int i=0; i<two_to_input.size(); i++)
  {
  
    if (isPrime(two_to_input.get(i)) && input_integer % two_to_input.get(i)==0)
    {
      while (input_integer % two_to_input.get(i)==0)
      {
        Prime_Factors[current_prime_factor_index]=(two_to_input.get(i));
        current_prime_factor_index++;
        input_integer=input_integer/two_to_input.get(i);
      }
    }
  }
  return Prime_Factors;
}
}