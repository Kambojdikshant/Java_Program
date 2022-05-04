package Unit_01;

interface In1{
	void display(int p) ; 
}
class Testclass implements In1{
	public void display(int p) {
		System.out.println("The value of p "+p);
	}
}
public class Interfacemethod {

	public static void main(String[] args) {
		Testclass obj = new Testclass() ; 
		obj.display(5);

	}

}
