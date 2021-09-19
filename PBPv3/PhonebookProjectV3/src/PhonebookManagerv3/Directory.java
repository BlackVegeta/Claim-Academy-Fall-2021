package PhonebookManagerv3;

public class Directory {
	
//create an array of persons
	
	Person[] record = new Person[0];
	
	//adds a person to the array
	
	public Person[] addRecord(Person newRecord) {
		//create temporary array that is 1 larger than the current array
		Person[] temp = new Person[record.length +1];
		
		// add the person in the original array to the temporary one
		
		for (int i = 0; i < record.length; i++) {
			temp[i] = record[i];
			
		}
		
		// add the new person to the end of the temp array
		temp[temp.length-1] = newRecord;
		// reassign the original array to the new one
		record = temp;
		
		for(int i = 0; i < record.length; i++) {
			for(int j = 0; j < record.length; j++) {
				if(record[i].getLastName().toLowerCase().compareTo(record[j].getLastName().toLowerCase()) > 0) {
					Person temp2 = record[j];
					record[j] = record[i];
					record[j] = temp2;
				}
			}
		}
		
		return record;
	}
	
	public Person[] getDirectory() {
		return record;
	}
	
	public Person[]	sort(Person[] record) {
		
		for (int i = 1; i < record.length; i++) {
			if(record[i-1].getLastName().toLowerCase().compareTo(record[i].getLastName().toLowerCase()) > 0) {
				Person temp2 = record[i-1];
				record[i-1] = record[i];
				record[i] = temp2;
			}
	}
		return record;
		}
	
	//need to make method addPerson in this file
	public void exitDirectory() {
		System.out.println("Thank you, have a nice day!");
	}
	
	public Person[] deleteContact(String phoneNumber) {
		
		int tally = 0;
		
		for(int i = 0; i < record.length; i++) {
			
			if(record[i].getPhoneNumber(null).equals(phoneNumber)) {
				
			} else {
					
				tally++;
					}
				}
	
		Person[] phone = new Person[tally];
		
		int y = 0;
		
		for(int j = 0; j < record.length; j++) {
			
			if(record[j].getPhoneNumber(null).equals(phoneNumber)) {
				
			} else {
				phone[y] = record[j];
						y++;
			}
	}
			sort(phone);
			return phone;
			}
	
	public void updateContact () {
		
	}
	// prints all records details 
	public void printDirectory (Person[] viewPerson) {
		for (int i = 0; i < viewPerson.length; i++) {
			System.out.println("\n--------Person Details---------\n");
			record[i].getPerson();
			
		}
	}
		
		// start the search sub menu for smaller parameters
	public void displaySearch(Person[] searchPerson) {
		for (int i = 0; i < searchPerson.length; i++) {
			System.out.println("\n---------Person Details---------\n");
			searchPerson[i].getPerson();
		}
		
	}
	public Person[] searchFirstName(String firstName) {
		
		int counter = 0;
		
		for(int i=0; i < record.length; i++) {
			if(record[i].getFirstName().toUpperCase().equals(firstName.toUpperCase())) {
				counter++;
			}
		}
		
		Person[] newRecord = new Person[counter];
		
		int tally = 0;
		
		for(int j = 0; j < record.length; j++) {
			if(record[j].getFirstName().toUpperCase().equals(firstName.toUpperCase())) {
				newRecord[tally]=record[j];
				tally++;
			}
		}
		sort(newRecord);
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
		
		for(int j = 0; j < record.length; j++) {
			if(record[j].getLastName().equalsIgnoreCase(lastName)) {
				newRecord[tally]=record[j];
				tally++;
			}
		}
		sort(newRecord);
		return newRecord;
	}
		
	//find record by searching telephone number
	
	public Person[] searchPhoneNumber(String phoneNumber) {
		
		int temp = 0;
		
		for(int i = 0; i < record.length; i++) {
			
			if(record[i].getPhoneNumber(null).equals(phoneNumber)) {
				temp++;
				
				
			}
		}
		
		Person[] newRecord = new Person[temp];
		
		int tally = 0;
		
		for (int j = 0; j < record.length; j++) {
			if (record[j].getPhoneNumber(null).equals(phoneNumber)) {
				newRecord[tally] = record[j];
				tally++;
			}
		}
		sort(newRecord);
		return newRecord;
		
		
	}
	
	
	//@SuppressWarnings("unlikely-arg-type")
	public Person[] searchCity(String city) {
	
		int counter = 0;
		
		for(int i=0; i < record.length; i++) {
			if(record[i].getCity().toLowerCase().equals(city.toLowerCase())) {
				counter++;
			}
		}
		
		Person[] newCity = new Person[counter];
		
		int y = 0;
		
		for(int j = 0; j < record.length; j++) {
			if(record[j].getCity().toLowerCase().equals(city.toLowerCase())) {
				
				newCity[y] = record[j];
				y++;
			}
		}
		sort(newCity);
		return newCity;
	}
		

	
	//@SuppressWarnings("unlikely-arg-type")
	public Person[] searchState(String state) {
		
		int counter = 0;
		
		for(int i = 0; i < record.length; i++) {
			if(record[i].getState().toUpperCase().equals(state.toUpperCase())) {
				counter++;
			}
		}
		
		Person[] newState = new Person[counter];
	
		int tally = 0;
		
		for(int i = 0; i < record.length; i++) {
			if(record[i].getState().toUpperCase().equals(state.toUpperCase())) {
				
				newState[tally]=record[i];
				tally++;
			}
		}
		sort(newState);
		return newState;
	}

	}


