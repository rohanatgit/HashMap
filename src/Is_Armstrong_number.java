import java.util.Scanner;

public class Is_Armstrong_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(armstrong(n));
    }
    public static boolean armstrong(int n){
        int d=countdigit(n);
        int ans=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
             ans=(int)(ans+Math.pow(rem,d));
             n=n/10;
        }
        return (ans==temp);
    }
    public static int countdigit(int n){
        int c=0;
        while(n>0){
            n=n/10;
            c++;
        }
        return c;
    }
}
