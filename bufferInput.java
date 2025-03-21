import java.io.*;

public class bufferInput {

    public static int prime(int z){

        for(int i = 2; i < z; i++){
            if(z % i == 0){
                return 0;
            }
        }
            return z;
    }
   public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine().trim()); 
    int m = 0;

    for(int i = 2; i <= a; i++){
        m = m + prime(i);
    }
    System.out.println(m);
   }    
}
