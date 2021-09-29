package task28sept;
import java.util.Scanner;

public class MinNumber {
	  
		static void min(int arr[]){  
		int min=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(min>arr[i])  
		  min=arr[i];  
		  
		System.out.println("smallest number is : "+min);  
		}  
			public static void main(String args[]){  
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter array element");
				int a[]= new int[5];
			for(int j=0; j<a.length; j++) {
				a[j]=sc.nextInt();
			}
			min(a); 
			}
}
