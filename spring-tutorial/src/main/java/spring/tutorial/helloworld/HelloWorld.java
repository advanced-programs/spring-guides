package spring.tutorial.helloworld;

public class HelloWorld {

	private String name;
	private String message;

	public void getName() {
		System.out.println("Your Name : " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

}
