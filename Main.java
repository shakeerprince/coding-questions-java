//1 2 3 4 5
//1,2,3,4,5
//{1,2,3,4,5}
/*
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i =0; i< n;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int a: arr){
            System.out.print(a + " ");
        }
    }
}


//Array List input 
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}



//space and comma seperate input
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] s = input.split(" ");
        
        ArrayList<Integer> arr= new ArrayList<>();
        int sum = 0;
        
        for(String token : s){
            int num = Integer.parseInt(token);
            arr.add(num);
            sum += num;
        }
        
        System.out.println(sum);
        
        
    }
}


//if scanner class not works
import java.io.*;

public class bufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        double b = Double.parseDouble(br.readLine());
        byte c = Byte.parseByte(br.readLine());
        boolean d = Boolean.parseBoolean(br.readLine());
        String name = br.readLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(name);
    }
}


*/

//case 4 : worst case and rare case

//[1,2,3,4,5]

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Case 4 -> [1,2,3,4,5]
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.startsWith("[") && input.endsWith("]")) {
            input = input.substring(1, input.length() - 1);
        }

        String[] s = input.split(",");
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (String token : s) {
            int num = Integer.parseInt(token);
            arr.add(num);
        }
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}






















































