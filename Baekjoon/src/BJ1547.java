// 공(브론즈3)
// 구현, 시뮬레이션
import java.io.*;
import java.util.StringTokenizer;
public class BJ1547 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int arr[] = new int[4];
        arr[1] = 1;
        for(int i = 0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int x = arr[a];
            arr[a] = arr[b];
            arr[b] = x;
        }
        for(int i = 1; i<4; i++){
            if(arr[i] == 1){
                System.out.println(i);
            }
        }
    }
}
