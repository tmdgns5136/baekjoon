import java.io.*;
public class BJ17626 {
    static boolean isSquare(int n){
        int s = (int)Math.sqrt(n);
        return s * s  == n;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(isSquare(n)){
            System.out.println(1);
            return;
        }
        for(int i =1; i*i<=n; i++){
            if(isSquare(n - i*i)){
                System.out.println(2);
                return;
            }
        }

        for(int i = 1; i*i <=n ;i++){
            for(int j =1; j*j<=n; j++){
                if(isSquare(n - i*i - j*j)){
                    System.out.println(3);
                    return;
                }
            }
        }
        System.out.println(4);
        
    }
}
