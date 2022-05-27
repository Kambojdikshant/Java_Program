package Unit_03;

import java.util.Scanner;

/* multithreading prerequists 
//1. multiprocessing :- 
 *          1. Sequential mp :- only one process execute at a time , 
 *          2. parallel mp :- every tasks will get a processing unit. it is not feasible 
 *          3. concarrent mp :- it is process using the switching operation. it process randomly and operation using operating system
 *             (it is best processing but it is a expensive)
 *             
 
// 2. Multitasking :- 
        1. Sequential mt :- 
        2. parallel mt :-  
        3. (concarrent mt ) :- 
*/
public class P16_MultiThreading {
		public static void main(String[] args)
		{
			
//			MultiThreadingInJava obj = new MultiThreadingInJava();
//			obj.threadConcept();
//			obj.threadSynchronization();
//			obj.interThreadCommunication();
//			obj.ProducerConsumerProblems();
//			obj.Wait_And_Notify();
//			obj.show1();
//			obj.show2();
			Thread t1 = new Thread(new T1(), "T1" ) ; // T1 is the name given to the jvm. and t1 is name given for the stack
			Thread t2 = new Thread(new T2(), "T2" ) ;
			Thread t3 = new Thread(new T3(), "T3" ) ;
			t1.start();  
			t2.start();
			t3.start();
		}
}


class MultiThreadingInJava
{
	void threadConcept()
	{
		
	}
	
	void threadSynchronization()
	{
		
	}
	
	void interThreadCommunication()
	{
		
	}
	
	void ProducerConsumerProblems()
	{
		
	}
	
	void Wait_And_Notify()
	{
		
	}
	void show1(){
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in) ; 
		int a = sc.nextInt() ; 
		System.out.println(a);
	}
	void show2() {
		for(int i=0; i<10; i++) {
			System.out.println("Hey-2");
		}
	}
}
class T1 extends Thread {
	public void run(){
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in) ; 
		int a = sc.nextInt() ; 
		System.out.println(a);
	}
}
class T2 extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Hey-2");
		}
	}
}
class T3 extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Hey-3");
		}
	}
}