package WEEK_2;

import java.util.Scanner;
public class printltor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a <= b){
            System.out.print(a + " ");
            a++;
        }

        System.err.println();
        sc.close();
    }
}
