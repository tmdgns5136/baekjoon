import java.io.*;
public class BJ17103 {
    static int arr[] = new int[1000001];
    static void eratos(){
        for(int i = 2; i<=1000000; i++){
            arr[i] = 1;
        }
        for(int i = 2; i*i <= 1000001; i++){
            if(arr[i] == 1){
                for(int j = i*i; j<1000001; j += i){
                    arr[j] = 0;
                }
            }
        }
    }
    static int pan(int n){
        int total = 0;
        int sum = 0;
        for(int i = 2; i<=n/2; i++){
                if((arr[i] == 1) && (arr[n-i] == 1)){
                    if(i + n-i == n){
                        if(i == n-i){
                            total += 1;
                        }
                        else{
                            sum += 1;
                        }
                    }
                }
        }
        total += sum;
        return total;

    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        eratos();
        for(int i = 0; i<T; i++){
            int x = Integer.parseInt(br.readLine());
            System.out.println(pan(x));
        }
    }
}
