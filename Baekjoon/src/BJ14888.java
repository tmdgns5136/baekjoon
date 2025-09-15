// 연산자 끼워넣기(실버1)
// 백트래킹
import java.io.*;
import java.util.*;
public class BJ14888 {
    static int N;
    static int arr[];
    static int op[] = new int[4];
    static int visited[] = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static void DFS(int index, int currentValue){
        if(index == N){
            max = Math.max(max, currentValue);
            min = Math.min(min, currentValue);
            return;
        }
        
        for(int i = 0; i < 4; i++){
            if(op[i] > 0){
                op[i]--;
                int nextValue = currentValue;
                if(i == 0) nextValue += arr[index];
                else if(i == 1) nextValue -= arr[index];
                else if(i == 2) nextValue *= arr[index];
                else if(i == 3) nextValue /= arr[index];
                DFS(index+1, nextValue);
                op[i]++;
            }
        }
        
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<4; i++){
            op[i] = Integer.parseInt(st.nextToken());
        }
        DFS(1,arr[0]);
        System.out.println(max);
        System.out.println(min);
    }
}
