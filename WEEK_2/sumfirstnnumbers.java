package WEEK_2;

import java.util.Scanner;
public class sumfirstnnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = (a*(a+1))/2;
        System.out.println(sum);
        sc.close();
    }
}
