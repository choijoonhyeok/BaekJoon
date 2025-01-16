import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	String str[] = s.nextLine().split(" ");
    	long array[] = new long[10];
    	long result =0;
    	for(int i =0; i<3;i++) {
    		array[i]=Long.parseLong(str[i]);
    		
    	}
    	long a = array[0];
    	long b = array[1];
    	long c = array[2];
    	
    	
    	System.out.print(a+b+c);
    }
}
