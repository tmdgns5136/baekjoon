import java.util.*;
import java.io.*;
public class BJ11723 {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        HashSet<Integer>arr = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("add")){
                int x = Integer.parseInt(st.nextToken());
                arr.add(x);
            }
            else if(s.equals("remove")){
                int x = Integer.parseInt(st.nextToken());
                if(arr.contains(x)){
                    arr.remove(x);
                }
            }
            else if(s.equals("check")){
                int x = Integer.parseInt(st.nextToken());
                if(arr.contains(x)){
                    sb.append(1).append("\n");
                }
                else{
                    sb.append(0).append("\n");
                }
            }
            else if(s.equals("toggle")){
                int x = Integer.parseInt(st.nextToken());
                if(arr.contains(x)){
                    arr.remove(x);
                }
                else{
                    arr.add(x);
                }
            }
            else if(s.equals("all")){
                arr.clear();
                for(int j = 1; j<=20; j++){
                    arr.add(j);
                }
            }
            else if(s.equals("empty")){
                arr.clear();
            }
        }
        System.out.println(sb);
    }
}
