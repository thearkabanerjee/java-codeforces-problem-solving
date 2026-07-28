import java.util.*;

public class rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Area = " +area(a, b));
        System.out.println("Perimeter = "+ perim(a,b));

        sc.close();
    }

    public static int area(int l, int b){
        return (l *b);
    }

    public static int perim(int l, int b){
        return (2 *(l+b));
    }

}
