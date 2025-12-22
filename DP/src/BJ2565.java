// 전깃줄(골드5)
// DP
// A값 기준 정렬
// B값 기준으로 LIS(Longest Increasing Subsequence)
// N - LIS = 답
import java.io.*;
import java.util.*;
public class BJ2565 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][2];
        int max = 0;
        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr, (a,b) -> a[0] - b[0]);
        int dp[] = new int[N];
        Arrays.fill(dp, 1);
        for(int i = 0; i<N; i++){
            for(int j = 0; j<i; j++){
                if(arr[i][1] > arr[j][1]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        System.out.println(N-dp[N-1]);

    }
}
