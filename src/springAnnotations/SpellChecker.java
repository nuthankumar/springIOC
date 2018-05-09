package springAnnotations;

public class SpellChecker {
	public void init() {
	      System.out.println("Init method");
	   }
	   public void Destroy() {
		   System.out.println("Destroy method");
	   }
	 public SpellChecker(){
	      System.out.println("Inside SpellChecker constructor." );
	   }
	   public void checkSpelling(){
	      System.out.println("Inside checkSpelling." );
	   }
}
