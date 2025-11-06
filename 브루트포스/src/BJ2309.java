// 일곱 난쟁이(브론즈1)
// 브루트포스
import java.util.*;
import java.io.*;
public class BJ2309 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[9];
        for(int i =0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int sum = 0;
        for(int i = 0; i<9; i++){
            sum += arr[i];
            
        }
        sum -= 100;
        for(int i =0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(i != j){
                    if((arr[i] + arr[j]) == sum){
                        arr[i] = 0;
                        arr[j] = 0;
                        break;
                    }
                }
            }
            if(arr[i] == 0){
                break;
            }
        }
        for(int i =0; i<9; i++){
            if(arr[i] != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
