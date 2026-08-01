import java.util.Scanner;

public class methods {
    public static void main(String[] args){
        //methods
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        happysong(a);
        System.out.println(squareofnums(b));
        sc.close();
        
    }

    public static void happysong(int a){
        for (int i = 0; i < a; i++){
            System.out.println("happy birthday to you");
            System.out.println("happy birthday to you");
            System.out.println("happy birthday dear user");
            System.out.println("happy birthday to you\n");
        }
    }

    static int squareofnums (int b){
        return (b * b);
    }
}
