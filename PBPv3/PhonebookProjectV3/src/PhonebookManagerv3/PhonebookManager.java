package PhonebookManagerv3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;


public class PhonebookManager {
	

	public static void main(String[] args) {
		
		Person r1 = new Person("John", " ", "Doe", "114 Marke St.","St.Louis","MO","63403","6366435698");
		Person r2 = new Person("John", "E", "Doe", "324 Main St.", "St.Charles", "MO", "63303", "8475390126l");
		Person r3 = new Person("John", "Michael West", "Doe", "574 Pole Ave", "St.Peters", "MO", "63333", "5628592375");
		
		Scanner input = new Scanner(System.in);
		
		Directory d = new Directory();
		d.addRecord(r1);
		d.addRecord(r2);
		d.addRecord(r3);
		
		int choice = 0;
		
		
		while (choice != 6) {
			choice = topMenu();
			switch(choice) {
			
			case 1:
				
				Person[] viewPerson = d.record;
				d.printDirectory(viewPerson);
				break;
				
			case 2:
				
				System.out.println("ENTER FIRST NAME: ");
				String firstName = input.next();
				System.out.println("ENTER MIDDLE NAME or type n/a: ");
				String middleName = input.next();
				System.out.println("ENTER LAST NAME: ");
				String lastName = input.next();
				System.out.println("ENTER THE STREET NAME: ");
				String street = input.next();
				System.out.println("ENTER THE CITY: ");
				String city = input.next();
				System.out.println("ENTER THE STATE: ");
				String state = input.next();
				System.out.println("ENTER THE ZIP CODE: ");
				String zipCode = input.next();
				System.out.println("ENTER PHONE NUMBER W/O SPACES AND (-):  ");
				String phoneNumber = input.next();
				
				Person r4 = new Person (firstName, middleName, lastName, street, city, state, zipCode, phoneNumber);
	
				d.addRecord(r4);
				d.printDirectory(d.getDirectory());
					
				break;	
			
		
			
			case 3:
				
					int choice2 = 0;
					
					while(choice2 !=6) {
						
						choice2 = searchMenu();
						
						switch(choice2) {
					
		
					case 1:
						System.out.println("Enter the person's first name: ");
						String firstName2 = input.nextLine();
						d.displaySearch(d.searchFirstName(firstName2));
						break;
					
					case 2:
						
						System.out.println("Enter the person's last name: ");
						String lastName2 = input.nextLine();
						d.displaySearch(d.searchLastName(lastName2));
						break;
						
					case 3:
						
						System.out.println("Enter the name of the city: ");
						String city2 = input.nextLine();
						d.displaySearch(d.searchCity(city2));
						break;
						
					case 4:
						
						System.out.println("Enter the name of the state: ");
						String state2 = input.nextLine();
						d.displaySearch(d.searchState(state2));
						break;
						
					case 5:
						
						System.out.println("Enter in the phone number (ex.8887472219):  ");
						String phoneNum = input.next();
						d.displaySearch(d.searchPhoneNumber(phoneNum));
						break;
						
					case 6:
						System.out.println("Enter in the number 6 & Press enter to return to main menu:  ");
						topMenu();
						break; }
					}	
		
			case 4:
						
						int choice3 = 0;
						System.out.println("*****Update Menu*****");
						System.out.println();
						System.out.println("Enter corresponding number to update your record:   ");
						
						
						while(choice3 != 3) {
							
							choice3 = updateEntryMenu();
							
							switch(choice3) {
							
							case 1:
								
								
								System.out.println();
								System.out.println("******** Enter the Following Information to Update Record");
								System.out.println();
								System.out.println("Enter the first name: ");
								String first = input.next();
								System.out.println("Enter the Middle Name: ");
								String middle = input.next();
								System.out.println("Enter the Last Name: ");
								String last = input.next();
								System.out.println("Enter the Street Name: ");
								String street1 = input.next();
								System.out.println("Enter the City Name: ");
								String city1 = input.next();
								System.out.println("Enter the State: ");
								String state1 = input.next();
								System.out.println("Enter the Zip Code: ");
								String zip = input.next();
								System.out.println("Enter Phone Number (w/o -/ or spaces): ");
								String phone = input.next();
								
								Person r7 = new Person(first, middle, last, street1, city1, state1, zip, phone );
								d.addRecord(r7);
								
								
								break;
								
							case 2:
								
								System.out.println("Enter the Phone Number  of the Record You Would Like to Update: ");
								String phone3 = input.next();
								d.displaySearch(d.deleteContact(phone3));
							
								break;
								
							case 3:
								
								System.out.println("**Return Back to Main Menu**");
								topMenu();
								break;		
					
							}
						}
							
						
		  
			case 5: 
						System.out.println("Enter the Telephone Number You Would Like Remove: ");
						String phone5 = input.next();
						
						d.displaySearch(d.deleteContact(phone5));
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
		System.out.println("1.Update All Info");
		System.out.println("2.Update Phonenumber");
		System.out.println("3.Return to the Main Menu"); //topMenu();
		System.out.println();
		System.out.print("Choose from the following selections:  ");
		
		int choice = input.nextInt();
		return choice;
			
		}
	}


	
			