package spring;

public class App {

	public static void main(String[] args) throws ClassNotFoundException {

		//App a=new App();
		Provider pr=new Provider();
		Renderer rn=new Renderer(pr);
		rn.render(pr);
		Class c=Class.forName("spring.App");
		System.out.println(c.getName());
		
	}

	
	
}
