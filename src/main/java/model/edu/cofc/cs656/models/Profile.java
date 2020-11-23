package model.edu.cofc.cs656.models;

public class Profile {

	private String firstName;
	private String lastName;
	private String cellphone;
	private int rating;

	
	public Profile(String firstName, String lastName, String cellphone, int rating) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cellphone = cellphone;
		this.rating = rating;
	}

	
	@Override
	public String toString() {
		return "Profile: " + firstName + " " + lastName + " " + cellphone + " " + rating + " star";
	}


	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getCellphone() {
		return cellphone;
	}



	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	private void updateProfile() {
		
	}
	
	private void updateImage() {
		
	}
	
}
