package springIOC;

public class MainService {

	 private MainInterface MainInterface;
	    
	// private MainInterface sub2 = new SubClassQ2();
	 
	    public void askQuestion()
	    {
	        System.out.println(MainInterface.popQuestion());
	    }
}
