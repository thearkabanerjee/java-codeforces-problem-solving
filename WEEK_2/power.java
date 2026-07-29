package WEEK_2;


import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(powery(a, b));
        sc.close();
    }

    public static long powery(int a, int b){
        long power = 1;
        for (int i= 0; i< b; i++){
            power *= a;
        }

        return power;
    }
}
