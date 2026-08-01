import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int score = sc.nextInt();
        String passOrFail = (score>=60)? "Pass": "Fail";
        String oddOrEven = (score % 2 ==0)? "Even" : "Odd";
        
        System.out.println(passOrFail);
        System.out.println(oddOrEven);
        sc.close();
    }
}
