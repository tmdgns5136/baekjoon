import java.util.*;
import java.io.*;
public class BJ1931 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int meeting[][] = new int[N][2];
        for(int i =0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            meeting[i][0] = Integer.parseInt(st.nextToken());
            meeting[i][1] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(meeting, (a,b) -> {
            if(a[1] != b[1]) return a[1] - b[1];
            else return a[0] - b[0];
        });
        
        int count = 0;
        int endTime = 0;

        for(int i =0; i<N; i++){
            if(meeting[i][0] >= endTime){
                count += 1;
                endTime = meeting[i][1];
            }
        }
        System.out.println(count);

    }
}
