package WEEK_2;


import java.util.Scanner;
public class printnumberinreverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = 0 ;

        while (a > 0){
            b *= 10;
            b += (a % 10);
            a /= 10;
        }

        System.out.println(b);
        sc.close();


    }
}
