import java.util.Scanner;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayDeque<Long> deque = new ArrayDeque<>();
        
        long n = s.nextLong();
 
        for(long i=0;i<n;i++) {
         long x = s.nextLong();
       
        	if(x==0) {
        		deque.pop();
        		
        	}
        	else {
        		deque.push(x);
        
        	}
        	}
        
       
        long result = 0;
        for (long value : deque) {
            result += value;
        }
        System.out.print(result);
    }
}