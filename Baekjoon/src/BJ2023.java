// 신기한 소수(골드5)
// 백트래킹
import java.io.*;
public class BJ2023 {
    static int N;
    static int arr[] = new int[10000001];
    static StringBuilder sb = new StringBuilder();
    static void DFS(int value, int count){
        if(count == N){
            sb.append(value + "\n");
            return;
        }
        for(int digit : new int[]{1, 3, 7, 9}){
            int next = value * 10 + digit;
            if(prime(next)){
                DFS(next, count+1);
            }
        }
    }

    static boolean prime(int i){
        for(int j = 2; j<=Math.floor(Math.sqrt(i)); j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int arr1[] = {2,3,5,7};
        for(int i = 0; i<4; i++){
            DFS(arr1[i], 1);
        }
        System.out.print(sb);
    }
}
