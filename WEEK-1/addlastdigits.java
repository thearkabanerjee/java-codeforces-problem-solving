import java.util.*;

public class addlastdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();

        System.out.println((a % 10)+ (b % 10));
        sc.close();
    }
}
