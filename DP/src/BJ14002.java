// 가장 긴 증가하는 부분 수열 4(골드4)
// DP
// 길이 구하는 건 11503과 같음
// 역추적해서 인덱스 저장
import java.io.*;
import java.util.*;
public class BJ14002 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N+1];
        int result[] = new int[N+1];
        int dp[] = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int maxIdx = 0; // 최장 길이를 가진 인덱스 저장용
        for(int i = 1; i<=N; i++){
            dp[i] = 1; 
            for(int j = 1; j<i; j++){
                if(arr[j] < arr[i]){
                    if(dp[i] < (dp[j] + 1)){
                        result[i] = j;
                        dp[i] = dp[j] + 1;
                    }
                }
            }
            if(max < dp[i]){
                max = dp[i];
                maxIdx = i;
            }
        }
        System.out.println(max);
        StringBuilder sb = new StringBuilder();
        while(maxIdx != 0){
            stack.push(arr[maxIdx]);
            maxIdx = result[maxIdx];
        }
        while(!stack.empty()){
            sb.append(stack.pop() + " ");
        }
        System.out.println(sb.toString().trim());
    }
}
