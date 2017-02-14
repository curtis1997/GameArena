public class Driver {
   
 public static void main(String[] arguments)
 {
	 int Width = 800;
	 int Height = 500;
	 int Diameter = 10;
	 int NumberOfBalls = 4;
	 int i = 0;
	 int Speed = 3;
	 
	 String ballColour = "Red";
	 GameArena Arena = new GameArena(Width, Height);
	 
	 Ball[] balls = new Ball[NumberOfBalls];
  
	 
	     for (i = 0 ; i < balls.length; i++)
		 {
			    
                balls[i] = new Ball(Math.random()*(Width-Diameter), 10, 10, "GREEN");
				Arena.addBall(balls[i]);
			
			     for (int j = 0; j<(((Height/2)+3)/Speed); j++)
				 {
				   for (int p = 0; p<i+1; p++)
				   balls[p].movedown(Speed);
			       Arena.pause();
				 }
		 }
		 for (int j = 0; j<200; j++)
			{
			balls[i-1].movedown(Speed);
			Arena.pause();
			}
	
 }

}