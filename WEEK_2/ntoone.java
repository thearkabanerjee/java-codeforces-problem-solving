package WEEK_2;

import java.util.*;
public class ntoone {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();

        for (int i = a; i>= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
