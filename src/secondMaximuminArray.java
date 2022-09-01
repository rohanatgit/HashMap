import java.util.Scanner;

public class secondMaximuminArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int secoundmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secoundmax=max;
                max=arr[i];
            }
            else if(arr[i]>secoundmax && arr[i]!=max){
                secoundmax=arr[i];
            }
        }
        System.out.println(secoundmax);
    }
}
