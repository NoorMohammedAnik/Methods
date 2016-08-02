/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;
public class SumOfNumbers {
    public static void main(String[] args) {
        
  System.out.println("Sum from 1 to 10 is " + sum(1, 10));
  System.out.println("Sum from 20 to 30 is "+sum(20, 30));
  System.out.println("Sum from 35 to 45 is "+sum(35, 45));

  }
    
  public static int sum(int x, int y) 
  {
      int sum = 0;
      for (int i = x; i <= y; i++)
      {
      sum+=i;
      }
      return sum;
  }    
}
