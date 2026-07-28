import java.util.Scanner;

public class factor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();

        System.out.println(factory(a, b));
        sc.close();
    }

    public static String factory(int a , int b){
        if(a % b == 0){
            return "Yes";
        }else{
            return "No";
        }
    }
}
