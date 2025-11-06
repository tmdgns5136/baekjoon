import java.util.*;
public class BJ12865 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int arr[][] = new int[N+1][2];
        for(int i =1; i<=N; i++){
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        int dp[][] = new int[N+1][K+1];
        for(int i =1; i<=N;i++){
            int weight = arr[i][0];
            int value = arr[i][1];
            for(int j = 0; j<=K; j++){
                if(weight > j){ // 물건을 못넣음
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight] + value);
                }
                }

        }
        System.out.println(dp[N][K]);
        scanner.close();
    }
}
