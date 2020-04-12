package maincode;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import playercode.Player;

public class RPScode {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Applicationcontext.xml");
		System.out.println("Let's Start with <******ROCK-PAPER-SCISSOR*****> Game...............");
		System.out.println("Here Rock=r , Paper=p and Scissor=s ");
		context.getBean("player",Player.class);
		for(int i=1 ;i<=50;i++)
		{
		
			System.out.println("************************Round "+i+"**************************");
			Player.result();
	
		}
		System.out.println("Game is Finish.");
		context.close();

	}

}
