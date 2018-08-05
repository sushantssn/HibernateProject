package MyModelClasses.dto;

public class TransactionTracking {

	
	int TrackingID ;
	String TrackingDetail;
	
	private Bank bank;

	public int getTrackingID() {
		return TrackingID;
	}

	public void setTrackingID(int trackingID) {
		TrackingID = trackingID;
	}

	public String getTrackingDetail() {
		return TrackingDetail;
	}

	public void setTrackingDetail(String trackingDetail) {
		TrackingDetail = trackingDetail;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	
}
