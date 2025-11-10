// 가장 큰 증가하는 부분 수열(실버2)
// DP
// dp[i] -> i번째 수를 마지막으로 하는 합 최댓값
import java.io.*;
import java.util.StringTokenizer;
public class BJ11055 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int dp[] = new int[N+1];
        int max = 0;
        for(int i = 1; i<=N; i++){
            dp[i] = A[i];
            for(int j = 1; j<i; j++){
                if(A[j] < A[i]){
                    dp[i] = Math.max(dp[i], dp[j] + A[i]);
                }
            }
            max = Math.max(dp[i], max);

        }
        System.out.println(max);
    }
}
