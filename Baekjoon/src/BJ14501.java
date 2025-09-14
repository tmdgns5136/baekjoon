// 퇴사(실버3)
// DP
import java.io.*;
import java.util.StringTokenizer;
public class BJ14501 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int T[] = new int[N+2];
        int P[] = new int[N+2];
        int dp[] = new int[N+2];
        for(int i = 1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = N; i > 0; i--){
            if (i + T[i] <= N + 1){
                dp[i] = Math.max(P[i] + dp[i + T[i]], dp[i+1]);
            }
            else{
                dp[i] = dp[i+1];
            }
        }
        System.out.println(dp[1]);
    }
}
