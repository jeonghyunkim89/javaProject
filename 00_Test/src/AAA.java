import java.util.Scanner;

public class AAA{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        check(a);
        check(b);
        check(c);
    }
    static void check(int n){
        if(n%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}