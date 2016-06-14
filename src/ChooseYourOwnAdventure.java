import java.util.Scanner;

public class ChooseYourOwnAdventure {
	
	static Scanner keyboard=new Scanner(System.in);
	
	public static void main(String[] args)
	
	{
		System.out.println("WELCOM TO MITCHELL'S TINY ADVENTURE");
		
		System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?");
		
		String firstlevel, secondlevel, thirdlevel, fourthlevel;
		
		firstlevel=keyboard.next();
		
		if (firstlevel.equals("kitchen"))
		{
			System.out.println("There is a long countertop with dirty dishes everywhere."
					         + " Off to one side there is, as you'd expect, a refrigerator. "
					         + "You may open the \"refrigerator\" or look in a \"cabinet\".");
			
			secondlevel=keyboard.next();
			
			if (secondlevel.equals("refrigerator"))
			{
				System.out.println("Inside the refrigerator you see food and stuff."
						+ " It looks pretty nasty. Would you like to eat some of the food?"
						+ " (\"yes\" or \"no\")");
				
				thirdlevel=keyboard.next();
				
				if (thirdlevel.equals("no"))
				{
					System.out.println("Would you like to cook food using kitchen?"
							+ " (\"yes\" or \"no\")");
					fourthlevel=keyboard.next();
					
					if (fourthlevel.equals("no"))
					{
						System.out.println("You die of starvation... eventually.");
					}
					else if(fourthlevel.equals("yes"))
					{
						System.out.println("You saved your life. Congrats!");
					}
					
				}
				else if(thirdlevel.equals("yes"))
				{
					System.out.println("The food makes you sick. "
							+ "Would you like to take some pills? "
							+ "(\"yes\" or \"no\")");
					fourthlevel=keyboard.next();
					if (fourthlevel.equals("no"))
					{
						System.out.println("You die of sickness... eventually.");
					}
					else if(fourthlevel.equals("yes"))
					{
						System.out.println("You saved your life. Congrats!");
					}
					
				}
				
			}
			else if(secondlevel.equals("cabinet"))
			{
				System.out.println("There is a jacket and a book. What would you like to take?"
						+ "\"jacket\" or \"book\"");
				thirdlevel=keyboard.next();
				if(thirdlevel.equals("jacket"))
				{
					System.out.println("Would you like to put on this jacket?"
							+ " (\"yes\" or \"no\")");
					fourthlevel=keyboard.next();
					if (fourthlevel.equals("no"))
					{
						System.out.println("You die of cold... eventually.");
					}
					else if(fourthlevel.equals("yes"))
					{
						System.out.println("You saved your life. Congrats!");
					}					
				}
				else if (thirdlevel.equals("book"))
				{
					System.out.println("Would you like to read this book?"
							+ " (\"yes\" or \"no\")");
					fourthlevel=keyboard.next();
					if (fourthlevel.equals("yes"))
					{
						System.out.println("You die of eye sickness... eventually.");
					}
					else if(fourthlevel.equals("no"))
					{
						System.out.println("You saved your life. Congrats!");
					}				
					
				}
			}
		}
		else if(firstlevel.equals("upstairs"))
		{
			System.out.println("Upstairs you see a hallway. At the end of the hallway is the master"
					+ " \"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like"
					+ " to go?");
			secondlevel=keyboard.next();
			
			if(secondlevel.equals("bedroom"))
			{
				System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture."
						+ " The bed is unmade. In the back of the room, the closet door is ajar. "
						+ "Would you like to open the door?  (\"yes\" or \"no\")");
				thirdlevel=keyboard.next();
				if(thirdlevel.equals("no"))
				{
					System.out.println("Would you like to go out? (\"yes\" or \"no\")");
					fourthlevel=keyboard.next();
					if (fourthlevel.equals("no"))
					{
						System.out.println("You die in this room... eventually.");
					}
					else if(fourthlevel.equals("yes"))
					{
						System.out.println("You saved your life. Congrats!");
					}				
					
				}
				else if(thirdlevel.equals("yes"))
				{
					System.out.println("The door is broken. Would you like to fix the door? (\"yes\" or \"no\")");
					fourthlevel=keyboard.next();
					
					if (fourthlevel.equals("no"))
					{
						System.out.println("You die in this room... eventually.");
					}
					else if(fourthlevel.equals("yes"))
					{
						System.out.println("You saved your life. Congrats!");
					}	
				}
			}
			else if (secondlevel.equals("bathroom"))
			{
				System.out.println("In this bathroom, thers is a towel and a toothbrush."
						+ "Which one do you want to take? ");
				thirdlevel=keyboard.next();
				if(thirdlevel.equals("towel"))
				{
					System.out.println("Would you like to wash your face? (\"yes\" or \"no\")");
					fourthlevel=keyboard.next();
					if (fourthlevel.equals("no"))
					{
						System.out.println("You die in this room... eventually.");
					}
					else if(fourthlevel.equals("yes"))
					{
						System.out.println("You saved your life. Congrats!");
					}				
					
				}
				else if(thirdlevel.equals("toothbrush"))
				{
					System.out.println("Would you like to brush your teeth? (\"yes\" or \"no\")");
					fourthlevel=keyboard.next();
					
					if (fourthlevel.equals("no"))
					{
						System.out.println("You die in this room... eventually.");
					}
					else if(fourthlevel.equals("yes"))
					{
						System.out.println("You saved your life. Congrats!");
					}	
				}
				
			}
		}
	}

}
