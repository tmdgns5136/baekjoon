import java.io.*;
import java.util.*;
public class BJ1697 {


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int visited[] = new int[100001];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        visited[N] = 1;

        while(!q.isEmpty()){
            int cur = q.poll();
            if(cur == K){
                System.out.println(visited[cur] - 1);
                break;
            }

            int next[] = {cur - 1, cur + 1, cur*2};
            for(int i = 0; i<3; i++){
                if(next[i] >= 0 && next[i] <= 100000 && visited[next[i]] == 0){
                    visited[next[i]] = visited[cur] + 1;
                    q.add(next[i]);
                }
            }
        }
    }
}
