package Unit_02;
/*
 * Abstract Class
 *  - An abstract class must be declared with an abstract keyword 
 *  
 *  - Abstraction is a process of hiding the implementation details.
 *    and showing only functionality function declaration to the user.
 *  - can not make object of abstract class directly, but through derived class
 *  
 *  - Example of abstract method?
 *  - Abstract class may abstract or non-abstract methods 
 *  - (0-100) abstract method can be there 
 *  
 *  - In case of Interface:- 100% abstract method should be there! 
 *  
 *  Final Class
 *  - The main purpose of using a class being declared as final is to prevent the class from being inheritance 
 *  - If a class is marked as final then no class can inherit any feature from the final class.
 *  - You cannot extend a final class. if you try it gives you couple time error.
 */
abstract class Bike{
	int a ; 
	
	Bike(){
		System.out.println("Inside Bike Constructor " + a);
	}
	
	abstract void run() ; // abstract method (0-100%)
	
	void display() {
		System.out.println("This is a display method");
	}
}
class Honda4 extends Bike{
	void run() {
		
	}
}
public class P09_Task01_AbstractClassInJava {

	public static void main(String[] args) {
		Bike obj = new Honda4() ; 
		//obj.run() ; 
		obj.display();
		
		// can not be instaniated 
		// Bike obj2 = new Bike()

	}

}
// Final Class 
final class Super{
	public int data = 30 ; 
	
	void display()
	{
		System.out.println(data);
	}
}
/* class Sub extends Super{ // can not extends(inherit final class) 
    
	 void display2()
		{
			System.out.println(data);
		}

}*/
