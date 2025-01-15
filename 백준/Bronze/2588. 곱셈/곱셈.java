import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	int a = s.nextInt();
    	String str[] = s.next().split("");
    	int array[] = new int[3];
    	
    	for(int i =0; i<3;i++) {
    		array[i]=Integer.parseInt(str[i]);  		
    	}
    	
    	int b = a* array[2];
    	int c = a*array[1];
    	int d = a*array[0];
    	int result = b+c*10+d*100;
    	
    	System.out.println(b);
    	System.out.println(c);
    	System.out.println(d);
    	System.out.println(result);

    }
}
