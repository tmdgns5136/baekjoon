// 스티커(실버1)
// DP

import java.io.*;
import java.util.*;
public class BJ9465 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            int sticker[][] = new int[2][N];
            for(int j = 0; j<2; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k = 0; k<N; k++){
                    sticker[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            if(N == 1){
                System.out.println(Math.max(sticker[0][0], sticker[1][0]));
            }
            int dp[][] = new int[3][N];
            dp[1][0] = sticker[0][0];
            dp[2][0] = sticker[1][0];
            for(int j = 1; j<N; j++){
                dp[0][j] = Math.max(dp[0][j-1], Math.max(dp[1][j-1], dp[2][j-1]));
                dp[1][j] = Math.max(dp[0][j-1], dp[2][j-1]) + sticker[0][j];
                dp[2][j] = Math.max(dp[0][j-1], dp[1][j-1]) + sticker[1][j];
            }
            System.out.println(Math.max(dp[0][N-1], Math.max(dp[1][N-1], dp[2][N-1])));
        }
    }
}
