package WEEK_2;

import java.util.Scanner;

public class countnums {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int positive = 0;
        int negative = 0;
        int even = 0;
        int odd = 0;
        int n = sc.nextInt();

        for (int i = 0; i <n; i++){
            int a = sc.nextInt();
            if (a >0){
                positive += 1;
            }else if (a<0){
                negative += 1;
            }

            if (a % 2 == 0){
                even += 1;
            }else{
                odd += 1;
            }
        }
        
        System.out.println(positive);
        System.out.println(negative);
        System.out.println(even);
        System.out.println(odd);

        sc.close();
    }
}
