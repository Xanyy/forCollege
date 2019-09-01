package Model;

public class Person extends Name {
	
	private String phone, email;
	
	Person(String firstName, String middleName, String lastName, String phone, String email) {
		super(firstName, middleName, lastName);
		this.phone = phone;
		this.email = email;
	}
	
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
