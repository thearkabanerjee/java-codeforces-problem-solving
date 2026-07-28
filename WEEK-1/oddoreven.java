import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        System.out.println(even(a));
        sc.close();
    }

    public static String even(int a){
        if (a % 2 == 0){
            return ("Even");
        }else{
            return ("Odd");
        }
    }
}
