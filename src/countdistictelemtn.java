import java.util.Arrays;
import java.util.Scanner;

public class countdistictelemtn {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++) {
            boolean f=false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    f=true;
                    break;
                }

            }
            if(f==false){
                c++;
            }

        }
        System.out.println(c);

    }
}
