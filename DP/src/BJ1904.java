import java.util.*;
public class BJ1904 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long dp[] = new long[N+1];
        if(N == 1){
            dp[1] = 1;
            System.out.println(dp[1]);
        }
        else if(N == 2){
            dp[2] = 2;
            System.out.println(dp[2]);
        }
        else{
            dp[1] = 1;
            dp[2] = 2;
            for(int i =3; i<=N; i++){
                dp[i] = (dp[i-2] + dp[i-1]) % 15746;
            }
            System.out.println(dp[N]);
        }
        
        scanner.close();
    }
}
