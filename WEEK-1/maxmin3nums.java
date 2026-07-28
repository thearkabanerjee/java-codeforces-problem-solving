import java.util.Scanner;

public class maxmin3nums {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();



    if(a <= b && a <= c){
        System.out.println("Min = "+ a);
    }else if (b <= a && b <= c){
        System.out.println("Min = "+ b);
    }else{
        System.out.println("Min = "+ c);
    }
    if (a >= b && a>= c){
        System.out.println("Max = " + a);
    }else if (b >= a && b >= c){
        System.out.println("Max = " + b);
    }else{
        System.out.println("Max = "+ c);
    }
    sc.close();
    }
    
}
