// 부등호(실버1)
// 백트래킹
import java.io.*;
import java.util.*;
public class BJ2529 {
    static int k;
    static char arr1[]; // 부등호 배열
    static int arr2[], visited[]; // 정수 배열
    static String max = "";
    static String min = "";
    static StringBuilder sb = new StringBuilder();
    static void DFS(int count){
        if(count == k+1){
            sb = new StringBuilder();
            for(int i = 0; i<k+1; i++){
                sb.append(arr2[i]);
            }
            if(max.equals("") || sb.toString().compareTo(max) > 0){
                max = sb.toString();
            }
            if(min.equals("") || sb.toString().compareTo(min) < 0){
                min = sb.toString();
            }
            return;
        }
            for(int i = 0; i<10; i++){
                if(visited[i] == 0){
                    if(count == 0 || check(arr2[count-1], i, arr1[count-1])){
                        visited[i] = 1;
                        arr2[count] = i;
                        DFS(count+1);
                        visited[i] = 0;
                    }
            }
        }
    }
    static boolean check(int a, int b, char op){
        if(op == '<') return a<b;
        else return a>b;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        arr1 = new char[k+1];
        arr2 = new int[k+1];
        visited = new int[10];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<k; i++){
            arr1[i] = st.nextToken().charAt(0);
        }
        DFS(0);
        System.out.println(max);
        System.out.println(min);
    }
}
