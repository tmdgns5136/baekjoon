// 유레카 이론(브론즈1)
// 브루트포스
import java.io.*;
public class BJ10448 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int Tn[] = new int[1001];
        for(int i = 1; i<=1000; i++){
            Tn[i] = (i*(i+1))/2;
        }
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<T; i++){
            boolean check = false;
            int k = Integer.parseInt(br.readLine());
            for(int j = 1; j<k; j++){
                for(int x = 1; x<k; x++){
                    for(int y=1; y<k; y++){
                        if((Tn[j] + Tn[x] + Tn[y]) == k){
                            check = true;
                            break;
                        }
                    }
                    if(check){
                        break;
                    }
                }
                if(check){
                    sb.append(1 + "\n");
                    break;
                } 
            }
            if(!check){
                sb.append(0 + "\n");
            }
            
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
