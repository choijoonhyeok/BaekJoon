import java.util.Scanner;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
          
        int fn = s.nextInt();
        HashMap<Integer,Integer> ahash = new HashMap <>(); 
        for (int i=0; i<fn;i++) {
        	int aint =s.nextInt();
        	ahash.put(aint,ahash.getOrDefault(aint,0)+1);
        }
        int sn = s.nextInt();
        StringBuilder result = new StringBuilder();
        for(int i=0;i<sn;i++) {
        	int sint = s.nextInt();
        	result.append(ahash.getOrDefault(sint,0)).append(" ");
        }
        System.out.println(result.toString());
        
    }
}
