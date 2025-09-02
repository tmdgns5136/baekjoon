import java.util.*;
public class BJ1932 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[][] = new int[N][N];
        for(int i =0; i<N; i++){
            for(int j =0; j<i+1; j++){
                arr[i][j] = scanner.nextInt();
            }
        }   
        int dp[][] = new int[N][N];
        dp[0][0] = arr[0][0];
        int max = 0;
        if(N == 1){
            System.out.println(arr[0][0]);
        }
        else{
            for(int i =1; i<N; i++){
            for(int j =0; j<i+1; j++){
                if(j == 0){
                    dp[i][j] = dp[i-1][j] + arr[i][j];
                }
                else if (i == j){
                    dp[i][j] = dp[i-1][j-1] + arr[i][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
                }
                if(max < dp[i][j]){
                    max = dp[i][j];
                }
            }
            
        }
        System.out.println(max);
    }
        
        scanner.close();
    }
}
