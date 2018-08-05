package MyModelClasses.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;



@Embeddable
public class Address {
	
	@Column(name = "Street_Name")
	private String Street = null ;
	@Column(name = "City_Name")
	private String City = null;
	@Column(name = "State_Name")
	private String State = null;
	
	private String Pincode = null;
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}  

}
