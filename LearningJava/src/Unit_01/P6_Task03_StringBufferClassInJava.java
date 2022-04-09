package Unit_01;
/*
 * 3 ways 
 * StringBuffer() ; 
 * StringBuffer(String src) ; 
 * StringBuffer(int capacity) 
 * 
 * StringBuffer is mutable unlike String 
 */
public class P6_Task03_StringBufferClassInJava {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello") ; 
		sb.append("java") ; 
		System.out.println(sb.charAt(0)); 
		
		// StringBuffer class append() Method now original string is changed 
		System.out.println(sb);
		
		// StringBuffer insert() method
		StringBuffer sb2 = new StringBuffer("Hello") ; 
		sb2.insert(1, "Python") ; // now original string is change
		System.out.println(sb2); // prints HPythonello 
		
		// StringBuffer replace method
		StringBuffer sb3 = new StringBuffer("Hello") ; 
		sb3.replace(1, 3, "java") ; 
		System.out.println(sb3);
		
		// StringBuffer delete() Method 
		StringBuffer sb4 = new StringBuffer("Hello") ; 
		sb4.delete(1, 3) ; 
		System.out.println(sb4); // prints Hlo
	}

}
