import java.util.*;
import java.io.*;
public class BJ11650 {
    static class ja{
        int x;
        int y;
        ja(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<ja> arr = new ArrayList<>();
        for(int i =0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr.add(new ja(x,y));
        }

        arr.sort((a,b) -> {
            if(a.x==b.x) return a.y - b.y;
            return a.x - b.x;
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(arr.get(i).x).append(" ").append(arr.get(i).y).append("\n");
        }
        System.out.print(sb);
    }
}
