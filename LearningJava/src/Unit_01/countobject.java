package Unit_01;
// Wap to count the total number of calls to function 
public class countobject {

	public static void main(String[] args) {
		
         ABC1 obj = new ABC1() ; 
         ABC1 obj1 = new ABC1() ; 
         ABC1 obj2 = new ABC1() ; 
         ABC1 obj3 = new ABC1() ; 
         ABC1 obj4 = new ABC1() ; 
         ABC1 obj5 = new ABC1() ; 
         obj.numCount() ; 
         obj1.numCount() ; 
         obj2.numCount() ; 
         obj3.numCount() ; 
         obj4.numCount() ; 
         obj5.numCount() ; 
         obj.display();
   }

}
class ABC1 {
	static int count = 0 ; 
	
	void numCount() {
		count++ ; 
	}
	void display() {
		System.out.println("Number of times call a function is " + count);
	}
}