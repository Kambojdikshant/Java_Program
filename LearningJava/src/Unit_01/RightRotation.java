package Unit_01;
// Program to right rotate an array 
import java.util.Scanner ; 
public class RightRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter the number ");
		int n = sc.nextInt() ; 
		int a[] = new int[n],i ; 
		System.out.println("Enter the number in the array ");
		for(i=0; i<n; i++) {
			a[i] = sc.nextInt()  ; 
		}
        int b =a[n-1] ; 
        for(i=n-1; i>0; i--)
        {
        	a[i] = a[i-1] ; 
        }
        a[0] = b ; 
        for(i=0; i<n; i++)
        {
        	System.out.println(a[i] + " ");
        }
	}

}
