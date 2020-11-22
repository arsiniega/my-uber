package model.edu.cofc.cs656.models;

public class PaymentType {
	
	private String account;
	private String routing;
	private String giftCard;

	
	public PaymentType(String account, String routing) {
		super();
		this.account = account;
		this.routing = routing;
		this.giftCard = null;
	}
	
	public PaymentType(String giftcard) {
		super();
		this.account = null;
		this.routing = null;
		this.giftCard = giftcard;
	}

	@Override
	public String toString() {
		return "PaymentType [account=" + account + ", routing=" + routing + ", giftCard=" + giftCard + "]";
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getRouting() {
		return routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public String getGiftCard() {
		return giftCard;
	}

	public void setGiftCard(String giftCard) {
		this.giftCard = giftCard;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "You're in PaymentType.");
        PaymentType pay = new PaymentType("00076542322","3445642");
        System.out.println( "Payment 1: " + pay);
        PaymentType pay2 = new PaymentType("UBER23A67");
        System.out.println( "Payment 2: " + pay2);
        pay2.setAccount("12234556");
        System.out.println( "Payment 2: " + pay2);
        
        
    }

}
