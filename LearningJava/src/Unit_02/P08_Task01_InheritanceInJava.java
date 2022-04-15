package Unit_02 ; 

/*
*  extends keyword 
 - Subclass 
 - superclass 
 - "Code- Re-usability"
 class derived class name extends base class
 {
    // methods and fields 
 }
 Types of inheritance 
   - single inheritance 
   - Multilevel inheritance
   - "Multiplle Inheritance":- java does not support Multiple inheritance with classes 
   -  It handles this features by implementing more than one interface instead of extends more than one classes
   
   - Hierachail inheritance(Tree?)?:yes 
   - Hybrid inheritance? No. 
   
   -Constructor calls flow in the inheritance
     - Default constructor 
     - Parameterized constructor
*/
public class P08_Task01_InheritanceInJava{
    public static void main(String []args){
        Three g = new Three() ; 
        g.methodOne() ; 
        g.methodTwo() ; 
        g.methodOne() ;
        g.methodThree() ; 
        
        Two two = new Two(1) ; 
        D obj = new D(2) ; 
        obj.methodFour() ; 
        
    }
}
class One{
    
    int a ; 
    
    One(int x){
        System.out.println("One Constructor") ; 
    }
    
    public void methodOne(){
        System.out.println("One Mthod") ; 
    }
}
class Two extends One{
    int b ; 
    
    Two(int x){
        super(3) ; 
        b = x ; 
        System.out.println("Two Constructor") ; 
    }
    
    public void methodTwo(){
        System.out.println("Second Mthod") ; 
    }
}
class Three extends Two{
    int c ; 
    
    Three(){
        super(1) ; 
       System.out.println("Three Constructor") ; 
    }
    Three(int x){
        super(1) ; 
        c = x ; 
        System.out.println("Three") ; 
    }
    
    public void methodThree(){
        System.out.println("Three Mthod") ; 
    }
}
class A {
    int a ; 
    
    A(int x){
        a = x ; 
    }
    
    void methodOne(){
        System.out.println(a) ; 
    }
}
class B extends A {
    int b ; 
    
    B(int x){
        super(10) ; 
        a = x ; 
    }
    
    public void methodTwo() {
        System.out.println(b) ; 
    }
}
class C extends A {
    int c ; 
    
    C(){
        super(10) ; 
        System.out.println("Class c constructor"); 
    }
    
    public void methodThree() {
        System.out.println(c) ; 
    }
}
class D extends A {
    int d ; 
    
    D(int x){
        super(x) ; 
        d = x ; 
    }
    
    public void methodFour() {
        System.out.println(d) ; 
    }
}