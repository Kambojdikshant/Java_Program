package Unit_02;
/*
 * An interface is a completely(100%)- "abstract class"
 * that is used to group related methods with empty bodies
 * 
 * -Need of interface?
 * - Multiple interface can be implemented at the same time in one class?
 * 
 * - Can an interface extends another interface ?
 * Answer is yes
 * 
 */
// interface (100% Abstract class)
interface Animal {
	public void animalSound() ; // interface method (does not have a body
	public void run() ; 
}

interface Human{
	public void humanSound() ; 
	public void run1() ; 
}
public class P12_Task01_InterfaceInJava  {

	public static void main(String[] args) {
		C1 obj = new C1() ; 
		obj.funcA() ; 
		obj.funcB() ; 
        
		/*public void animalSound() {
			
		}
		
		public void fun() {
			
		}*/
	}

}
// Multiple interface can be implemented at the same time 
class Species implements Animal, Human {
	@Override
	public void animalSound() {
		System.out.println("We are inside the animal sound method");
	}
	
	@Override
	public void run() {
		System.out.println("We are inside the run method");
	}
	
	@Override
	public void humanSound() {
		System.out.println("We are inside the humaSound method");
	}
	
	@Override
	public void run1() {
		System.out.println("We are inside the run1 method");
	}
}

interface A1{
	void funcA() ; 
}

interface B1 extends A1{
	void funcB() ; 
}

class C1 implements B1{
	public void funcA() {
		System.out.println("This is funcA from A1");
	}
	
	
	public void funcB() {
		System.out.println("This is funcB from A2");
	}
}
