import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class BJ2407 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if(n/2 < m){
            m = n-m;
        }
        BigInteger nsum = new BigInteger("1");
        BigInteger msum = new BigInteger("1");

        for(int i =0; i<m; i++){
            nsum = nsum.multiply(BigInteger.valueOf(n-i));
            msum = msum.multiply(BigInteger.valueOf(i+1));
        }
        
        System.out.println(nsum.divide(msum));
    }
}
