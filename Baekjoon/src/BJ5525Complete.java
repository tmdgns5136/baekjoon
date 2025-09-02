import java.io.*;
public class BJ5525Complete {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int count = 0;
        int result = 0;
        for(int i = 1; i<M-1;i++){
            if(s.charAt(i-1) == 'I' && s.charAt(i) == 'O' && s.charAt(i+1) == 'I'){
                count+=1;
                if(count >= N){
                    result+=1;
                }
                i+=1;
            }
            else{
                count = 0;
            }
        }
        System.out.println(result);
    }
}
