// 집합의 표현(골드5)
// 유니온 파인드 알고리즘
import java.io.*;
import java.util.*;
public class BJ1717 {
    static int parent[] = new int[1000001];
    static int find(int x){ // 재귀를 통해 부모들을 파악한다.
        if(x == parent[x]){
            return x;
        }
        else{
            return parent[x] = find(parent[x]);
        }
    }

    static void union(int x, int y){
        x = find(x);
        y = find(y);
        if(x != y){
            if(x < y){ // 부모가 더 작은 값에 합침
                parent[y] = x; // y의 부모가 x가 됨
            }
            else{
                parent[x] = y; // x의 부모가 y가 됨
            }
        }
    }

    static boolean isSameParent(int x, int y){
        x = find(x);
        y = find(y);
        if(x == y){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=n; i++){
            parent[i] = i;
        }
        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(x == 0){
                union(a, b);
            }
            if(x == 1){
                if(isSameParent(a, b)){
                    sb.append("YES\n");
                }
                else{
                    sb.append("NO\n");
                }
            }
        }
        if(sb.length() == 0){
            System.out.println();
        }
        else{
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
        }
    }
}
