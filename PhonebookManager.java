package PhonebookProject;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

@SuppressWarnings("unused")
public class PhonebookManager {
	

	public static void main(String[] args) {
		
		Address a1 = new Address("114 Marke St.", "St.Louis", "MO", "63403");
		Person r1 = new Person("John", " ", "Doe", a1, 6366435698l);
		Address a2 = new Address("324 Main St.", "St. Charles", "MO", "63303");
		Person r2 = new Person("John", "E", "Doe", a2, 8475390126l);
		Address a3 = new Address("574 Pole ave", "St. Peters", "MO", "63333");
		Person r3 = new Person("John", "Michael West", "Doe", a3, 5628592375l);
		
		Scanner input = new Scanner(System.in);
		
		Directory d = new Directory();
		d.addPerson(r1);
		d.addPerson(r2);
		d.addPerson(r3);
		
		int choice = 0;
		
		
		while (choice != 6) {
			choice = topMenu();
			switch(choice) {
			
			case 1:
				Person[] viewPerson = d.record;
				d.printDirectory(viewPerson);
				break;
				
			case 2:
				System.out.println("Under Maintenance");
				break;
			
			case 3:
				
					int choice2 = 0;
					
					while(choice2 !=6) {
						
						choice2 = searchMenu();
						
						switch(choice2) {
					
		
					case 1:
						System.out.println("Enter the person's first name: ");
						String firstName = input.nextLine();
						d.displaySearch(d.searchFirstName(firstName));
						break;
					
					case 2:
						
						System.out.println("Enter the person's last name: ");
						String lastName = input.nextLine();
						d.displaySearch(d.searchLastName(lastName));
						break;
						
					case 3:
						
						System.out.println("Enter the name of the city: ");
						String city = input.nextLine();
						d.displaySearch(d.searchCity(city));
						break;
						
					case 4:
						
						System.out.println("Enter the name of the state: ");
						String state = input.nextLine();
						d.displaySearch(d.searchState(state));
						break;
						
					case 5:
						
						System.out.println("Enter in the phone number (ex.8887472219):  ");
						break;
						
					case 6:
						System.out.println("Enter in the number 6 & Press enter to return to main menu:  ");
						topMenu();
						break; }
					}	
		
					case 4:
						
						int upgrade = 0;
						System.out.println("Enter the number of the person you would like to update:  ");
						long up = input.nextLong();
						d.searchPhoneNumber(up).getPerson();
						
						upgrade = 0;
						
						while(upgrade != 1) {
							
							upgrade = updateEntryMenu();
							
							switch(upgrade) {
							
							case 1:
								
								System.out.println("Enter the first name: ");
								String newFirstName = input.next();
								d.searchPhoneNumber(up).setFirstName(newFirstName);
								break;
								
							case 2:
								
								System.out.println("Enter the Middle Name: ");
								String newMidlleName = input.next();
								d.searchPhoneNumber(up).setMiddleName(newMidlleName);
								break;
								
							case 3:
								
								System.out.println("Enter the Last Name: ");
								String newLastName = input.next();
								d.searchPhoneNumber(up).setLastName(newLastName);
								break;		
					
							}
						}
							
						
		  
					case 5: 
						System.out.println("enter5");
						long remv = input.nextLong();
						d.deleteContact(d.searchPhoneNumber(remv));
						break;
					case 6: 
						d.exitDirectory(); 
						break;
			}
}
		input.close();
				}
	
	
			
	
	
	public static int topMenu() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("********Phonebook Manager Menu********");
		System.out.println();
		System.out.println("1.View Directory");
		System.out.println("2.Add Contact");
		System.out.println("3.Search Directory");
		System.out.println("4.Update Existing Contact");
		System.out.println("5.Delete Contact");
		System.out.println("6.Exit Phonebook Directory");
		System.out.println();
		System.out.println("***************************");

		System.out.print("Choose from the following selections & Press enter: ");
		System.out.println();
		int choice = input.nextInt();
		System.out.println();
		return choice; 
		
		}
   
	
	public static int searchMenu() {
		
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("*******Search Record Menu*******");
		System.out.println();
		System.out.println("1.Search by First Name");
		System.out.println("2.Search by Last Name");
		System.out.println("3.Search by City Name");
		System.out.println("4.Search by State Name");
		System.out.println("5.Search by Phone Number(ex.8884794554)");
		System.out.println("6.Return to Phonebook Manager Menu");
		System.out.println("Choose from the following selections & Press enter: ");
		System.out.println();
		
		int choice = input.nextInt();
		return choice;
	}
		
	public static int updateEntryMenu() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("\nWhich of the following ?\n");
		System.out.println("1.Update First Name");
		System.out.println("2.Update Middle Name");
		System.out.println("3.Update Last Name");
		System.out.println("4.Update Street");
		System.out.println("5.Update City");
		System.out.println("6.Update State");
		System.out.println("7.Update Zip Code");
		System.out.println("8.Update Phonenumber");
		System.out.println("9.Return to the Main Menu"); //topMenu();
		System.out.print("Choose from the following selections:  ");
		
		int choice = input.nextInt();
		return choice;
			
		}
	}


	
			