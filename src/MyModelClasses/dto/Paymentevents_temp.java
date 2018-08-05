/**
 * 
 */
package MyModelClasses.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Payment_temp")
public class Paymentevents_temp {
@Id
	 public int 
		id
;
	 public String 
		date
;
     
public String 
		status
;

public String 
		reason
;

//-------------------------------------------------Rishabh 2.0 start----------------------------------------//
public String 
		fromBankBICCode
; 

public String 
		toBankBICCode
 ;

public String 
		fromBankName
	; 

public String 
		toBankName
	;
	//-------------------------------------------------Rishabh 2.0 end----------------------------------------// 
	
	//-------------------------------------------------Sushant 3.0 start----------------------------------------//
public String 
	   	networkReference
	; 
	   
public int 
	  	msgNameId
	;
	   
public int 
		businessService
	; 
				
public String 
		valid
	;
public String
		instructionId
	; 
					   
public String 
		fundsAvailable
 ;
									   
public String 
		originator
	; 
public String 
		creditorAgent
	; 
public String 
		previousInstructingAgent
	;
public String 
		senderAckReceipt
	;

public String 
		receivedDate
	; 
public String 
		instructedAmount
	; 
public String 
		instructedAmountCcy
	;
public String 
		interbankSettlementAmt
	; 
public String 
		interbankSettlementAmtCcy
	; 
public String 
		interbankSettlementDate
	; 
public String 
		chargeBearer
	; 

public double 
		 confirmedAmount
	; 
	   
public String 
	   confirmedAmountCcy
	;
public String 
chargeamount
;

public String 
chargecreditCurrency
;
public String 
		fromCurrency
	;		
public String
		toCurrency
	;
public double 
		exchangeRate
	;		
public String 
		updatePayment
	; 
public String 
		duplicateMsgRef
	; 
public String 
		copiedBusinessService
	; 
	
	
}
