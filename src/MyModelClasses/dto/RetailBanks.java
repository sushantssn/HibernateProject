package MyModelClasses.dto;

import javax.persistence.Entity;

@Entity
public class RetailBanks extends Bank{

	public String Account_Type ;

	public String getAccount_Type() {
		return Account_Type;
	}

	public void setAccount_Type(String account_Type) {
		Account_Type = account_Type;
	}

	
}
