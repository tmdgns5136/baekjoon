// 가장 긴 감소하는 부분 수열(실버2)
// DP
// 가장 긴 증가하는 부분 수열 응용
import java.io.*;
import java.util.*;
public class BJ11722 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A[] = new int[N+1];
        int dp[] = new int[N+1];
        int max = 0;
        for(int i = 1; i<=N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = N; i>0; i--){
            dp[i] = 1;
            for(int j = N; j>i; j--){
                if(A[j] < A[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(dp[i], max);
        }
        System.out.println(max);

    }
}
