package OPPE1.WEEK2;
import java.util.Scanner;

public class gradedquestion1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        int innersum = 0;
        for (int i = 0; i<= n; i++){
            innersum += i * i;
            sum += innersum;
        }

        System.out.println(sum);
        sc.close();
    }
}
