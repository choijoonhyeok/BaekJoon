import java.util.Scanner;

class  Main {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 int n = s.nextInt();
		 long m = s.nextLong();
		 long []fint=new long [n];
		 long max=0;
		 for(int i=0; i<n; i++) {
			fint[i]= s.nextLong();
			
			if(fint[i]>max) {
				max = fint[i];
			}
			
		 }
		 
		 long left =1;
		 long right=max;
		 long result=0;
		 while(left<=right) {
			 long mid = (left+right)/2;
			 long count=0;
			 for(int i=0;i<n;i++) {
				 if(fint[i]-mid>0) {
					 count+=fint[i]-mid;
				 }
			 }
			 
			 if(m<=count) {
				 result = mid;
				 left = mid+1;
			 }
			 else {		 
				 right = mid-1;
			 }
			 
			 
		 }
		 
		 System.out.print(result);
	 }
	
}