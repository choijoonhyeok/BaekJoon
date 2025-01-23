import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PriorityQueue <Integer> minHeap =new PriorityQueue<>();
        
        int n = s.nextInt();
        
        for(int i=0;i<n;i++) {
        
        int x = s.nextInt();
        if(x==0) {
        	if(minHeap.isEmpty()) System.out.println(0);
        	else {
        		System.out.println(minHeap.poll());
        	}
        }
        else
        	minHeap.add(x);
        	
        	
        }
        
    }
}