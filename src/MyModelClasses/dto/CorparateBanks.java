package MyModelClasses.dto;

import javax.persistence.Entity;

@Entity
public class CorparateBanks  extends Bank {

	public String CorpAcc_type ;

	public String getCorpAcc_type() {
		return CorpAcc_type;
	}

	public void setCorpAcc_type(String corpAcc_type) {
		CorpAcc_type = corpAcc_type;
	}
	
}
