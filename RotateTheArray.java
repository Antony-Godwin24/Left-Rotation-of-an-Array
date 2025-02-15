import java.util.*;
public class RotateTheArray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size for the Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("The elements before rotating:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println("\nEnter the number of rotations:");
		int r=sc.nextInt();
		while(r>0){
			int temp=arr[0];
			for(int i=0;i<arr.length-1;i++){
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
			r--;
		}
		System.out.println("The elements after rotating:");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
		