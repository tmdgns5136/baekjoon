// 내려가기(골드5)
// DP
// 1, 2, 3 골랐을 때 각각 구해주고 최대, 최소 구해주기
import java.io.*;
import java.util.*;
public class BJ2096 {
    static int max, min, N;
    static int Max[], Min[], arr[][];

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1][4];
        Max = new int[4];
        Min = new int[4];
        for(int i = 1; i<=N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=3; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Max[1] = Min[1] = arr[1][1];
        Max[2] = Min[2] = arr[1][2];
        Max[3] = Min[3] = arr[1][3];
        for(int i = 2; i<=N; i++){
            int preMax[] = Max.clone();
            int preMin[] = Min.clone();

            Max[1] = arr[i][1] + Math.max(preMax[1], preMax[2]);
            Max[2] = arr[i][2] + Math.max(Math.max(preMax[1],preMax[2]), preMax[3]);
            Max[3] = arr[i][3] + Math.max(preMax[2], preMax[3]);

            Min[1] = arr[i][1] + Math.min(preMin[1], preMin[2]);
            Min[2] = arr[i][2] + Math.min(Math.min(preMin[1],preMin[2]), preMin[3]);
            Min[3] = arr[i][3] + Math.min(preMin[2], preMin[3]);
        }

        
        max = Math.max(Math.max(Max[1], Max[2]), Max[3]);
        min = Math.min(Math.min(Min[1], Min[2]), Min[3]);

        System.out.println(max + " " + min);
    }
}
