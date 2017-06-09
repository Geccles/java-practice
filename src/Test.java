
public class Test {
	
	public static String briansMood; 
	public static boolean happy;
	
	public static void main(String[] args){
		
		briansMood = "What is Brian's Current Mood?";
		myfeelings();
		
	}
	
	public static void myfeelings(){
		
		String currentMood = "Really Happy!";
		
		System.out.println(briansMood + " " + currentMood);
		
		happy = false;
		
		if (!happy)
		{
			currentMood = "Really Pissed Off!!";
			
			System.out.println(briansMood + " " + currentMood);
		}
	}
}
