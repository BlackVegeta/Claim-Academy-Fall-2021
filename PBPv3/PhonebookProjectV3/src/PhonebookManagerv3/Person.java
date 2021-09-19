package PhonebookManagerv3;

public class Person {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String fullName;
	private String phoneNumber;
	private String city;
	private String state;
	private String street;
	private String zipCode;
	
	

	
		public Person(String firstName, String middleName, String lastName, String street, String city, String state, String zipCode, String phoneNumber) {
			
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.city = city;
			this.state = state;
			this.street = street;
			this.zipCode = zipCode;
			
		}
			
		
	
		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			this.city = city;
		}



		public String getState() {
			return state;
		}



		public void setState(String state) {
			this.state = state;
		}



		public String getStreet() {
			return street;
		}



		public void setStreet(String street) {
			this.street = street;
		}



		public String getZipCode() {
			return zipCode;
		}



		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}



		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getMiddleName() {
			return middleName;
		}
		
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
			
		}
		
		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
			
		}
		
		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			if (this.middleName != " ") {
				this.fullName = firstName + " " + middleName + " " + lastName;
			} 
			this.fullName = firstName + " " + lastName;
		}

		public String getPhoneNumber(String phoneNumber) {
			return phoneNumber;
			
		}
		
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		

		public void getPerson() {
			if (middleName.length() != 0) { //Print records of people 
				System.out.println(firstName + " " + middleName + " " + lastName);
			} else {
				System.out.println(firstName + " " + lastName);
			}
			
			System.out.println(street + " " + city + ", " + state + " " + zipCode );
			System.out.println("Phone Number: " + formatPhone(phoneNumber) );
		}
		
		public String formatPhone(String phoneNumber) {
			String newPhone = phoneNumber;
			String newNum = "(" + newPhone.substring(0, 3) + ")" + newPhone.substring(3, 6) + "-" + newPhone.substring(6);
			
			return newNum;
		}
		//@Override
		//public String toString() {
			//return ("\nContact: " + this.fullName + " Address: " + address.getStreet() + " , " + address.getCity() + " , " + address.getState() + " , " + address.getZipCode() +
			 //" Phone Number: " + this.phoneNumber);
		}
		
		
