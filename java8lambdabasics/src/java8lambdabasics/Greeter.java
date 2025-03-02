package java8lambdabasics;

public class Greeter {
	
	public void greet(Greeting greeting) {
//		System.out.println("Hello World!");
		greeting.perform();
	}
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
	}
}
