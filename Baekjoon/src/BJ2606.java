import java.util.*;
class ja{
    int x;
    int y;
    ja(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class BJ2606 {

    static int sum = 0;
    static void BFS(int arr[], int x, int y){
        if(arr[x] == 1){
            arr[y] = 1;
        }
        else if (arr[y] == 1){
            arr[x] = 1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        LinkedList<ja> arr1 = new LinkedList<>();
        int arr[] = new int[N+1];
        arr[1] = 1;
        for(int i = 0; i < M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr1.add(new ja(x, y));
        }
        arr1.sort((a,b) -> {
            if(a.x==b.x) return a.y - b.y;
            return a.x - b.x;
        });
        for(int i = 0; i<M; i++){
            BFS(arr, arr1.get(i).x, arr1.get(i).y);
            BFS(arr, arr1.get(M-1-i).x, arr1.get(M-1-i).y);
        }
        arr1.sort((a,b) -> {
            if(a.y==b.y) return a.x - b.x;
            return a.y - b.y;
        });
        for(int i = 0; i<M; i++){
            BFS(arr, arr1.get(i).x, arr1.get(i).y);
            BFS(arr, arr1.get(M-1-i).x, arr1.get(M-1-i).y);
        }
        for(int i = 2; i<= N; i++){
            if(arr[i] == 1){
                sum += 1;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
