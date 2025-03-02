package java8lambdabasics;


interface Parent{
	default void sayHello() {
		System.out.println("Hello World kya haal chaal");
	}
}

class Child implements Parent{
	@Override
	public void sayHello(){
	System.out.println("Aabid k taraf se salam");
	}
}
public class defaultMethod {
	public static void main(String args[]) {
		Child c = new Child();
		c.sayHello(); 
	}
}
