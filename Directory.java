package PhonebookProject;

public class Directory {
	
//create an array of persons
	
	Person[] record = new Person[0];
	
	//adds a person to the array
	
	public void addPerson(Person newPerson) {
		//create temporary array that is 1 larger than the current array
		Person[] temp = new Person[record.length +1];
		// add the person in the original array to the temporary one
		
		for (int i = 0; i < record.length; i++) {
			temp[i] = record[i];
			
		}
		
		// add the new person to the end of the temp array
		temp[temp.length-1] = newPerson;
		// reassign the original array to the new one
		record = temp;
	}
	
	public Person[] getDirectory() {
		return record;
	}
	
	
	//need to make method addPerson in this file
	public void exitDirectory() {
		System.out.println("Thank you, have a nice day!");
	}
	
	public void deleteContact(Person delete) {
		
		Person[] temp = new Person[record.length-1];
		
		int tally = 0;
		
		for(int i = 0; i < record.length; i++) {
			if(record[i] != delete ) {
				temp[tally] = record[i];
				tally++;
			}
		}
	
	}
	
	public void updateContact () {
		
	}
	public void printDirectory (Person[] viewPerson) {
		for (int i = 0; i < viewPerson.length; i++) {
			System.out.println("\n--------Person Details---------\n");
			record[i].getPerson();
			
		}
	}
		
		
	public void displaySearch(Person[] searchPerson) {
		for (int i = 0; i < searchPerson.length; i++) {
			System.out.println("\n---------Person Details---------\n");
			searchPerson[i].getPerson();
		}
		
	}
	public Person[] searchFirstName(String firstName) {
		
		int counter = 0;
		
		for(int i=0; i < record.length; i++) {
			if(record[i].getFirstName().equalsIgnoreCase(firstName)) {
				counter++;
			}
		}
		
		Person[] newRecord = new Person[counter];
		
		int tally = 0;
		
		for(int i = 0; i < record.length; i++) {
			if(record[i].getFirstName().equalsIgnoreCase(firstName)) {
				newRecord[tally]=record[i];
				tally++;
			}
		}
		return newRecord;
	}
	
	
	public Person[] searchLastName(String lastName) {
		
	int counter = 0;
		
		for(int i=0; i < record.length; i++) {
			if(record[i].getLastName().equalsIgnoreCase(lastName)) {
				counter++;
			}
		}
		
		Person[] newRecord = new Person[counter];
		
		int tally = 0;
		
		for(int i = 0; i < record.length; i++) {
			if(record[i].getLastName().equalsIgnoreCase(lastName)) {
				newRecord[tally]=record[i];
				tally++;
			}
		}
		return newRecord;
	}
		
	//find record by searching telephone number
	
	public Person searchPhoneNumber(long phoneNumber) {
		
		int temp = 0;
		for(int i = 0; i < record.length; i++) {
			if(record[i].getPhoneNumber(phoneNumber) == phoneNumber) {
				temp = i;
				
				break;
			}
		}
		
		return record[temp];
		
		
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	public Person[] searchCity(String city) {
	
		int counter = 0;
		
		for(int i=0; i < record.length; i++) {
			if(record[i].getAddress().equals(city)) {
				counter++;
			}
		}
		
		Person[] newRecord = new Person[counter];
		
		int tally = 0;
		
		for(int i = 0; i < record.length; i++) {
			if(record[i].getAddress().equals(city)) {
				newRecord[tally]=record[i];
				tally++;
			}
		}
		return newRecord;
	}
		

	
	@SuppressWarnings("unlikely-arg-type")
	public Person[] searchState(String state) {
		
		int counter = 0;
		
		for(int i = 0; i < record.length; i++) {
			if(record[i].getAddress().equals(state)) {
				counter++;
			}
		}
		
		Person[] newRecord = new Person[counter];
	
		int tally = 0;
		
		for(int i = 0; i < record.length; i++) {
			if(record[i].getAddress().equals(state)) {
				newRecord[tally]=record[i];
				tally++;
			}
		}
		return newRecord;
	}

}


