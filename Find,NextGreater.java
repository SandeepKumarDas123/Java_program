
import java.util.*;
public class Main {
	public static void main(String[] args) {
		int arr[]={6,7,4,2,8,2,7,0,1,2,4};
		Stack<Integer>s=new Stack<>();
		int nxtGrtr[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--){
			 while(!s.isEmpty() && arr[s.peek()]<= arr[i])
			 s.pop();
			 if(s.isEmpty())
			 nxtGrtr[i]=-1;
			 else
			  nxtGrtr[i]=arr[s.peek()];
			
		
		s.push(i);
		}
		for(int i=0;i<nxtGrtr.length;i++)
		System.out.println(nxtGrtr[i]);
	}
}