package ch06_1_oop;

public class Contact {
	public static void main(String[] args) {
	Contack con = new Contack();
	con.setName("¿Œ¡§¿Ã");
	System.out.println(con.getName());
	
	con.setEmailAddress("qkrwlsgud890@gmail.com");
	System.out.println(con.getEmailAddress());
	
	con.setFaxNumber("01023741566");
	System.out.println(con.getFaxNumber());
	
	
	
	
	}
}








class Contack {
	String emailAddress;
	String faxNumber;
	String name;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	}
