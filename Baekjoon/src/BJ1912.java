import java.util.*;

public class BJ1912 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for(int i =0; i<N; i++){
            arr[i] = scanner.nextInt();
        }
        int dp[] = new int[N];
        dp[0] = arr[0];
        for(int i = 1; i<N; i++){
            dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
        }
        int max = dp[0];
        for(int i =1; i<N; i++){
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);


        scanner.close();
    }
}
