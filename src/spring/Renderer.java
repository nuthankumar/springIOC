package spring;

class Renderer implements MessageRenderer{
	Provider p1=null;
	Provider2 p2=null;
	Renderer(Provider p1){
		this.p1=p1;
	}
	Renderer(Provider2 p2){
		this.p2=p2;
	}
	public void render(Provider p1){
		System.out.println(p1.message);
	}
	public void render(Provider2 p2){
		System.out.println(p2.message);
	}
	
	public void render(){
		System.out.println("Default");
	}
}
