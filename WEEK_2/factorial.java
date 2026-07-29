package WEEK_2;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        long factory = 1;

        for(int i = 1; i <= a; i++){
            factory *= i;
        }

        System.out.println(factory);
        sc.close();
    }
}
