package PhonebookProject;

public class Person {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String fullName;
	private long phoneNumber;
	private Address address;
	
		public void addAddress(String street, String city, String state, String zipCode) {
			Address temp = new Address(street, city, state, zipCode);
			address = temp;
		}

		public Person(String firstName, String middleName, String lastName, Address address, long phoneNumber) {
			
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
			this.address = address;
			this.fullName = fullName;
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

		public long getPhoneNumber(long phoneNumber) {
			return phoneNumber;
			
		}
		
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public Address getAddress() {
			return this.address;
		}

		public void getPerson() {
			if (middleName.length() != 0) {
				System.out.println(firstName + " " + middleName + " " + lastName);
			} else {
				System.out.println(firstName + " " + lastName);
			}
			address.printAddress();
			System.out.println("Phone Number: " + formatPhone(phoneNumber) );
		}
		
		public String formatPhone(long phoneNumber) {
			String newPhone = Long.toString(phoneNumber);
			String newNum = "(" + newPhone.substring(0, 3) + ")" + newPhone.substring(3, 6) + "-" + newPhone.substring(6);
			
			return newNum;
		}
		//@Override
		//public String toString() {
			//return ("\nContact: " + this.fullName + " Address: " + address.getStreet() + " , " + address.getCity() + " , " + address.getState() + " , " + address.getZipCode() +
			 //" Phone Number: " + this.phoneNumber);
		}
		
		
