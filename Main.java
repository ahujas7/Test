import java.util.Random;


public class Main 
{



  public static void main(String[] args) 
  {
  	
	Random gen = new Random();
	
	int randomNum = gen.nextInt(100);

	System.out.println(randomNum);
  }


}
