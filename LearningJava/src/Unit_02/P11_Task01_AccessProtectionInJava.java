package Unit_02;

public class P11_Task01_AccessProtectionInJava {

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass() ; 
		obj.showData() ; 
		obj.accessData() ; 

	}

}
class ParentClass{
	int a ; // default protection 
	public int b = 20 ; // can be accese outside Unit_02 package but within same project
	protected int c = 30 ; // can only be accessed within Unit_02 package
	private int d = 40 ; // within Parent class only not even its sub-class 
	
	void showData() {
		System.out.println("Inside ParentClass");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
		System.out.println("d = "+ d);
	}
}

class ChildClass extends ParentClass{
	
	void accessData() { 
		System.out.println("Inside ChildClass");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
		//System.out.println("d = "+ d); // Private member cannot be accessed 
	}
}
class AnotherClass{
	
	void display() {
		ParentClass obj = new ParentClass() ; 
		System.out.println("Inside ParentClass");
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
}
