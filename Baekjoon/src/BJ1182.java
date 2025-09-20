// 부분수열의 합(실버 2)
// 백트래킹
import java.io.*;
import java.util.*;
public class BJ1182 {
    static int N, S, sum;
    static int result = 0;
    static int arr[], comb[];
    static void DFS(int index, int count, int x){
        if(count == x){
            for(int i = 0; i<x; i++){
                sum += comb[i];
            }
            if(sum == S){
                result+=1;
            }
            sum = 0;
            return;
        }
        for(int i = index; i<N; i++){
            int j = arr[i];
            comb[count] = j;
            DFS(i+1, count+1, x);
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr =new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i<=N; i++){
            sum = 0;
            comb = new int[i];
            DFS(0,0,i);
        }
        System.out.println(result);

    }
}
