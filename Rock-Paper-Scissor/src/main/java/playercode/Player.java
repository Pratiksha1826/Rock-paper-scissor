package playercode;

import java.util.Random;
import java.util.Scanner;

public class Player
{
	public static final String PAPER="p", ROCK="r" , SCISSOR="s";

	public static void result()
	{
		String playerfirst = playerchoice();
		String playersecond = playerchoice();
		String playerthird = playerchoice();
		String playerfourth = playerchoice();
		

		System.out.println("Player First :"+playerfirst);
		if(playerfirst.equals(ROCK))
		{
		
			 if( playersecond.equals(SCISSOR) || playerthird.equals(SCISSOR) || playerfourth.equals(SCISSOR))
				System.out.println("playerfirst is winner ");
			 else if(playersecond.equals(PAPER)||playerthird.equals(PAPER) || playerfourth.equals(PAPER))
				 System.out.println("playerfirst is loose ");
			 else if(playerfirst.equals(playersecond) && playerfirst.equals(playerthird) && playerfirst.equals(playerfourth))
				 System.out.println("It's die");
	
		}
		else if(playerfirst.equals(SCISSOR))
		{
			if(playersecond.equals(PAPER)||playerthird.equals(PAPER) || playerfourth.equals(PAPER))
			System.out.println("playerfirst is  winner..");
			else if(playersecond.equals(ROCK) || playerthird.equals(ROCK) || playerfourth.equals(ROCK))
				System.out.println("playerfirst is looser");
			else if(playerfirst.equals(playersecond) && playerfirst.equals(playerthird)  && playerfirst.equals(playerfourth))
				 System.out.println("It's die");
				
			
		}
		else if(playerfirst.equals(PAPER))
		{
			if(playersecond.equals(ROCK) || playerthird.equals(ROCK) || playerfourth.equals(ROCK))
			System.out.println("playerfirst is winner");
			else if(playersecond.equals(SCISSOR)||playerthird.equals(SCISSOR)||playerfourth.equals(SCISSOR))
				System.out.println("playerfirst is looser");
			else if(playerfirst.equals(playersecond) &&playerfirst.equals(playerthird)  && playerfirst.equals(playerfourth))
				 System.out.println("It's die");
		}
		
		
		System.out.println("Player second :"+playersecond);

		 if(playersecond.equals(ROCK))
		{

			 if( playerfirst.equals(SCISSOR) || playerthird.equals(SCISSOR) || playerfourth.equals(SCISSOR))
				System.out.println("playersecond is  winner ");
			 else if(playerfirst.equals(PAPER)||playerthird.equals(PAPER) || playerfourth.equals(PAPER))
				 System.out.println("playersecond is looser ");
			 else if(playersecond.equals(playerfirst) &&playersecond.equals(playerthird)  && playersecond.equals(playerfourth))
				 System.out.println("It's die");
	
		}
		else if(playersecond.equals(SCISSOR))
		{
			if(playerfirst.equals(PAPER)||playerthird.equals(PAPER) || playerfourth.equals(PAPER))
			System.out.println("playersecond is  winner..");
			else if(playerfirst.equals(ROCK) || playerthird.equals(ROCK) || playerfourth.equals(ROCK))
				System.out.println("playersecond is looser");
			else if(playersecond.equals(playerfirst) &&playersecond.equals(playerthird)  && playersecond.equals(playerfourth))
				 System.out.println("It's die");
				
			
		}
		else if(playersecond.equals(PAPER))
		{
			if(playerfirst.equals(ROCK) || playerthird.equals(ROCK) || playerfourth.equals(ROCK))
			System.out.println("playersecond is winner");
			else if(playerfirst.equals(SCISSOR)||playerthird.equals(SCISSOR)||playerfourth.equals(SCISSOR))
				System.out.println("playersecond is loser");
			else if(playersecond.equals(playerfirst) &&playersecond.equals(playerthird)  && playersecond.equals(playerfourth))
				 System.out.println("It's die");
		}
		 
		 System.out.println("Player third :"+playerthird);

		 if(playerthird.equals(ROCK))
		{
	
			 if( playerfirst.equals(SCISSOR) || playersecond.equals(SCISSOR) || playerfourth.equals(SCISSOR))
				System.out.println("playerthird is  winner ");
			 else if(playerfirst.equals(PAPER)||playersecond.equals(PAPER) || playerfourth.equals(PAPER))
				 System.out.println("playerthird is looser ");
			 else if(playerthird.equals(playerfirst) &&playerthird.equals(playersecond)  && playerthird.equals(playerfourth))
				 System.out.println("It's die");
	
		}
		else if(playerthird.equals(SCISSOR))
		{
			if(playerfirst.equals(PAPER)||playersecond.equals(PAPER) || playerfourth.equals(PAPER))
			System.out.println("playerthird is  winner..");
			else if(playerfirst.equals(ROCK) || playersecond.equals(ROCK) || playerfourth.equals(ROCK))
				System.out.println("playerthird is looser");
			else if(playerthird.equals(playerfirst)&&playerthird.equals(playersecond) && playerthird.equals(playerfourth))
				 System.out.println("It's die");
				
			
		}
		else if(playerthird.equals(PAPER))
		{
			if(playerfirst.equals(ROCK) || playersecond.equals(ROCK) || playerfourth.equals(ROCK))
			System.out.println("playerthird is winner");
			else if(playerfirst.equals(SCISSOR)||playersecond.equals(SCISSOR)||playerfourth.equals(SCISSOR))
				System.out.println("playerthird is loser");
			else if(playerthird.equals(playerfirst)&&playerthird.equals(playersecond)  && playerthird.equals(playerfourth))
				 System.out.println("It's die");
		}
	
		 System.out.println("Player fourth :"+playerfourth);

		 if(playerfourth.equals(ROCK))
		{
	
			 if( playerfirst.equals(SCISSOR) || playersecond.equals(SCISSOR) || playerthird.equals(SCISSOR))
				System.out.println("playerfourth is  winner ");
			 else if(playerfirst.equals(PAPER)||playersecond.equals(PAPER) || playerthird.equals(PAPER))
				 System.out.println("playerfourth is looser ");
			 else if(playerfourth.equals(playerfirst) &&playerfourth.equals(playersecond)  && playerfourth.equals(playerthird))
				 System.out.println("It's die");
	
		}
		else if(playerfourth.equals(SCISSOR))
		{
			if(playerfirst.equals(PAPER)||playersecond.equals(PAPER) || playerthird.equals(PAPER))
			System.out.println("playerfourth is  winner..");
			else if(playerfirst.equals(ROCK) || playersecond.equals(ROCK) || playerthird.equals(ROCK))
				System.out.println("playerfourth is looser");
			 else if(playerfourth.equals(playerfirst) &&playerfourth.equals(playersecond)  && playerfourth.equals(playerthird))
				 System.out.println("It's die");
				
			
		}
		else if(playerfourth.equals(PAPER))
		{
			if(playerfirst.equals(ROCK) || playersecond.equals(ROCK) || playerfourth.equals(ROCK))
			System.out.println("playerfourth is winner");
			else if(playerfirst.equals(SCISSOR)||playersecond.equals(SCISSOR)||playerfourth.equals(SCISSOR))
				System.out.println("playerfourth is loser");
			 else if(playerfourth.equals(playerfirst) &&playerfourth.equals(playersecond)  && playerfourth.equals(playerthird))
				 System.out.println("It's die");
		}
	
		
	}	
	
	/*Random access for Player first*/

	public static String playerchoice()
	{
		int number;
		String moves="";
		Random rd = new Random();
		number = rd.nextInt(3)+1;
		if(number==1)
			return moves=ROCK;
		if(number==2)
			return moves=PAPER;
		if(number==3)
			return moves=SCISSOR;
		return moves;
		
	}
	

	
	
	
}
	


