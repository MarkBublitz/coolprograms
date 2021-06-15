import java.util.Scanner;

public class WifiDiagnosis {
public static void main (String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("If you have a problem with internet connectivity, this Wifi diagnosis might work.");
	
	System.out.println("First step: reboot your computer");
	
	System.out.println("Are you able to connect with the internet? yes or no");
	String userResponse = input.nextLine();
	
	while (!userResponse.equals("yes") && !userResponse.equals("no")) { 
		System.out.println("please answer yes or no (in lower case)");
		userResponse = input.nextLine();
	}
	
	if (userResponse.equals("yes")) {
		System.out.println("Rebooting your computer seemed to work");
		System.exit(0);
	}
	else
		if(userResponse.equals("no")) {
			System.out.println("Second step: reboot your router");
			System.out.println("Now are you able to connect to the internet? yes or no");
			
			userResponse = input.nextLine();
			
			while (!userResponse.equals("yes") && !userResponse.equals("no")) { 
				System.out.println("please answer yes or no (in lower case)");
				userResponse = input.nextLine();
			}
			
			if (userResponse.equals("yes")) {
				System.out.println("Rebooting your router seemed to work");
				System.exit(0);
			}
			else
				if(userResponse.equals("no")) {
					System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
					System.out.println("Now are you able to connect to the internet? yes or no");
					
					userResponse = input.nextLine();
					
					while (!userResponse.equals("yes") && !userResponse.equals("no")) { 
						System.out.println("please answer yes or no (in lower case)");
						userResponse = input.nextLine();
					}
					
					if (userResponse.equals("yes")) {
						
						System.out.println("That seemed to work");
						System.exit(0);
						
					}
					
					else
						if(userResponse.equals("no")) {
							System.out.println("Fourth step: move your computer closer to your router");
							System.out.println("Now are you able to connect to the internet? yes or no");
							
							userResponse = input.nextLine();
							
							while (!userResponse.equals("yes") && !userResponse.equals("no")) { 
								System.out.println("please answer yes or no (in lower case)");
								userResponse = input.nextLine();
							}
							
							if (userResponse.equals("yes")) {
								
								System.out.println("That seemed to work");
								System.exit(0);
								
							}
							
							else
								if (userResponse.equals("no")) {
									
									System.out.println("Fifth step: contact your ISP");
									System.exit(0);
								}
							
						}
					
				}
			
		}
}

}