package model.edu.cofc.cs656.models;

public class Payment {
	
	private PaymentType payment;
	private boolean paymentSubscription;
	private double discountRate;
	
	public Payment(PaymentType payment, boolean paymentSubscription, double discountRate) {
		super();
		this.payment = payment;
		this.paymentSubscription = paymentSubscription;
		this.discountRate = discountRate;
	}



	@Override
	public String toString() {
		return "Payment [payment=" + payment + ", paymentSubscription=" + paymentSubscription + ", discountRate="
				+ discountRate + "]";
	}



	public PaymentType getPayment() {
		return payment;
	}



	public void setPayment(PaymentType payment) {
		this.payment = payment;
	}



	public boolean isPaymentSubscription() {
		return paymentSubscription;
	}



	public void setPaymentSubscription(boolean paymentSubscription) {
		this.paymentSubscription = paymentSubscription;
	}



	public double getDiscountRate() {
		return discountRate;
	}



	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
