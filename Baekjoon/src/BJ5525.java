import java.io.*;
public class BJ5525 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        sb.append(s);
        StringBuilder pn = new StringBuilder();
        pn.append("I");
        for(int i = 0; i<N; i++){
            pn.append("OI");
        }
        int sum = 0;
        for(int i = 0; i<M-2*N; i++){
            String x = sb.substring(i, i + (1 + 2*N));
            if(x.equals(pn.toString())){
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
