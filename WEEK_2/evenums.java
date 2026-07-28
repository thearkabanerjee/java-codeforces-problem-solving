package WEEK_2;

import java.util.Scanner;

public class evenums{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    
    for (int i = 2; i<= a; i++){
      if (i % 2 == 0){
        System.out.print(i+ " ");
      }
    }
    System.out.println();
    
    
    sc.close();
  }
}