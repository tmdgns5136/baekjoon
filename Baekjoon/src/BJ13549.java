import java.io.*;
import java.util.*;
public class BJ13549 {


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int visited[] = new int[100001];
        
        Deque<Integer> q = new ArrayDeque<>(); // 01BFS로 풀어야됨 원래 BFS는 모두 가중치 1 근데 이문제는 가중치 0이 존재
                                            // 따라서 최소 가중치를 찾는것이니 가중치 0을 queue에 먼저 넣어줘야됨
        q.add(N);
        visited[N] = 1;

        while(!q.isEmpty()){
            int cur = q.poll();
            if(cur == K){
                System.out.println(visited[cur] - 1);
                break;
            }

            int next[] = {cur*2, cur - 1, cur + 1}; //  순서는 이 순서대로 해야됨(-1한 이후 *2를 하였을 때 더 적은 cost로 이동가능하기때문)
            for(int i = 0; i<3; i++){
                if(next[i] >= 0 && next[i] <= 100000 && visited[next[i]] == 0){
                    if(i == 0){
                        visited[next[i]] = visited[cur];
                        q.addFirst(next[i]);
                        
                    }
                    else{
                        visited[next[i]] = visited[cur] + 1;
                        q.addLast(next[i]);
                    }
                }
            }
        }
    }
}
