package Hotel;

public class Hotel {
	
	private String name;
	private String address;
	private String contact; 
	private String director; 
	private String owner;
	private String rating; 
	private String noOfHalls;
	
	public Hotel(String name, String address, String contact, String director, String owner, String rating,
			String noOfHalls) {
		super();
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.director = director;
		this.owner = owner;
		this.rating = rating;
		this.noOfHalls = noOfHalls;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getContact() {
		return contact;
	}

	public String getDirector() {
		return director;
	}

	public String getOwner() {
		return owner;
	}

	public String getRating() {
		return rating;
	}

	public String getNoOfHalls() {
		return noOfHalls;
	}

	
	
}
