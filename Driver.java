public class Driver {
   
 public static void main(String[] arguments)
 {
	 int Width = 800;
	 int Height = 400;
	 int Diameter = 10;
	 boolean switchX = false;
     boolean switchY = false;
	 int randomx = (int)(Math.random()*10);
	 int randomy = (int)(Math.random()*10);
	 
	 String ballColour = "Red";
	 GameArena Arena = new GameArena(Width, Height);
	 Ball ball1 = new Ball(Width/2, Height/2, Diameter, ballColour);
	 Arena.addBall(ball1);
	 for(;;)
	 {		 
		 Arena.pause();
		 if(ball1.getXPosition() > (Width-Diameter))
		     ball1.setXPosition(ball1.getXPosition()-randomx);
	     else
			ball1.setXPosition(ball1.getXPosition()+randomx);
		
		if (ball1.getYPosition() > (Height-Diameter))
		     ball1.setYPosition(ball1.getYPosition()-randomy);
	    else
			ball1.setYPosition(ball1.getYPosition()+randomy);
	
	 }
 }

}