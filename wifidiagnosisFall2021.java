import java.util.Scanner;

public class wifidiagnosisFall2021 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		//String literals used during the program
		String greeting = "If you have a problem with internet connectivity, this WiFi diagnosis might work";
		String question = "Are you able to connect to the internet? (yes or no)";
		String inputValidation = "Please answer yes or no";
		
		String prompt1 = "First step: reboot your computer";
		String termination1 = "Rebooting your computer seemed to work";
		
		String prompt2 = "Second step: reboot your router";
		String termination2 = "Rebooting your router seemed to work";
		
		String prompt3 = "Third step: make sure the cables to your router are plugged in firmly and your router is getting power";
		String termination3 = "Checking the router's cables seemed to work";
		
		String prompt4 = "Fourth step: move your computer closer to your router";
		String termination4 = "Moving your computer closer to your router seemed to work";
		
		String prompt5 = "Fifth step: contact your ISP. Make sure your ISP is hooked up to your router";
		
		System.out.println(greeting); //program begins
		
		System.out.println(prompt1);  //outermost level
		System.out.println(question);
		
		String response = input.nextLine();
		
		while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
			System.out.println(inputValidation);
			response = input.nextLine();
		}
		
		if (response.equalsIgnoreCase("yes")) {
			System.out.println(termination1);
			System.exit(0);
		}
		else
			if (response.equalsIgnoreCase("no")) {
				System.out.println(prompt2);          //second level
				System.out.println(question);
				
				response = input.nextLine();
				
				while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
					System.out.println(inputValidation);
					response = input.nextLine();
				}
				
				if (response.equalsIgnoreCase("yes")) {
					System.out.println(termination2);
					System.exit(0);
				}
				else
					if (response.equalsIgnoreCase("no")) {
						System.out.println(prompt3);       //third level
						System.out.println(question);
						
						response = input.nextLine();
						
						while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
							System.out.println(inputValidation);
							response = input.nextLine();
						}
						
						if (response.equalsIgnoreCase("yes")) {
							System.out.println(termination3);
							System.exit(0);
						}
						
						else
							if (response.equalsIgnoreCase("no")) {
								System.out.println(prompt4);    //fourth level
								System.out.println(question);
								
								response = input.nextLine();
								
								while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
									System.out.println(inputValidation);
									response = input.nextLine();
								}
								
								if (response.equalsIgnoreCase("yes")) {
									System.out.println(termination4);
									System.exit(0);
								}
								
								else
									if (response.equalsIgnoreCase("no")) {
										System.out.println(prompt5);    //lowest level
										System.exit(0);
									}
							}
					}
				
				
			}
		
		
		
		
		
	}

	
}
