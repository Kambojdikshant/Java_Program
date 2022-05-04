package Unit_01;
import java.util.Scanner ; 
public class MatrixMultication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter the row and coloum");
		int n = sc.nextInt() ; 
		int a[][] = new int[n][n],i,j,k ; 
		int b[][] = new int[n][n] ; 
		int c[][] = new int[n][n] ; 
		System.out.println("Enter the number the first matrix ");
        for(i=0; i<n; i++) {
        	for(j=0; j<n; j++) {
        		a[i][j] = sc.nextInt() ; 
        	}
        }
        System.out.println("Enter the number the second matrix ");
        for(i=0; i<n; i++) {
        	for(j=0; j<n; j++) {
        		b[i][j] = sc.nextInt() ; 
        	}
        }
        for(i=0; i<n; i++) {
        	for(j=0; j<n; j++) {
        		int s  = 0 ; 
        		for(k=0; k<n; k++) {
        			s  = s+ a[i][k]*b[k][j] ; 
        		}
        		System.out.print(s + " ");
        	}
        	System.out.println();
        }
        
	}

}
