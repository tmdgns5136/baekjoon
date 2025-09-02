import java.util.*;
public class BJ2559 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int max = -2000;
        int total = 0;
        for(int i =0; i<=N-K; i++){
            total = 0;
            for(int j=i; j<i+K; j++){
                total += arr[j];
            }
            if(max < total){
                max = total;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
