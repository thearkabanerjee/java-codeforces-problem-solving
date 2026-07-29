package WEEK_2;


import java.util.Scanner;
public class printnumberinreverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();

        while (a > 0){
            System.out.print(a % 10);
            a /= 10;
        }

        System.out.println();
        sc.close();


    }
}
