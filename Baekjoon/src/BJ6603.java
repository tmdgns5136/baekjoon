// 로또(실버2)
// 백트래킹
import java.io.*;
import java.util.*;
public class BJ6603 {
    static int k, max, sum;
    static int arr1[], visited[];
    static int arr2[] = new int[6];
    static StringBuilder sb = new StringBuilder();
    static void DFS(int index, int count){
        if(sum == max){
            return;
        }
        if(count == 6){
            for(int i = 0; i<6; i++){
                sb.append(arr2[i] + " ");
            }
            sb.append("\n");
            sum += 1;
            return;
        }
        for(int i = index; i<=k; i++){
            int j = arr1[i];
            if(visited[j] == 0){
                visited[j] = 1;
                arr2[count] = j;
                DFS(i+1, count+1);
                visited[j] = 0;
            }
            
            
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();
            k = Integer.parseInt(st.nextToken());
            if(k == 0) break;
            arr1 = new int[k+1];
            visited = new int[50];
            for(int i = 1; i<=k; i++){
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            max = 1;
            for(int i = 0; i<k-6; i++){
                max *= (k-i);
                max /= (i+1);
            }
            DFS(1 ,0);
            sum = 0;
            System.out.println(sb);

        }
    }
}
