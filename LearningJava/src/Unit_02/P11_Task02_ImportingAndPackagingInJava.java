package Unit_02; // Inside this package create many class
/*
 * A java package is a group of similar types of classes, interface and sub-package
 * Package in Java can be categorized in two form
 * - built in package(lang, awt, javax, swing,net, io, util, sql)
 * - user defined package 
 * 
 * -Package also helps to avoid class name collision 
 * -Package also helps us to maintain access protection in Java
 * -Package are name in reverse order of domain names
 * -unit01.Javaproject.com -> "com.javaproject.unit01"
 * 
 * import java.util.vector ; // import the vector class from the package
 * import java.util.* ; // import all the classes from the util package
 * 
 * Static Import :
 * - Static import is a feature introduced in java programming language (version 5 and above)
 * - that allows members (field and methods) defined in a class as public static
 *   to be used in java code without specifying the class in which the field is defined
 *   
 */
import static java.lang.System.* ; 
import static java.lang.Math.* ;
import Unit_01.P4_Task01_ControlAndConditionalStatementInJava;
public class P11_Task02_ImportingAndPackagingInJava {

	public static void main(String[] args) {
		
		out.println("Welcome to Package") ; 
		
		out.println(sqrt(4)) ; 
		System.out.println(pow(2,2));
		System.out.println(abs(6,3));
        
		Statement obj = new Statement() ; 
		System.out.println(obj.x);
	}

}
