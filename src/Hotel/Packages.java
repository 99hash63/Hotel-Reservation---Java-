package Hotel;

public class Packages {

	private int packId;
	private String packageName;
	private float buffetPrice;
	private int numberOfMeals; 
	private float poolCharges; 
	private float gymCharges;
	private float liquor; 
	private String timeDuration;
	private String hotelName;
	
	public Packages(int packId, String packageName, float buffetPrice, int numberOfMeals, float poolCharges,
			float gymCharges, float liquor, String timeDuration, String hotelName) {
		super();
		this.packId = packId;
		this.packageName = packageName;
		this.buffetPrice = buffetPrice;
		this.numberOfMeals = numberOfMeals;
		this.poolCharges = poolCharges;
		this.gymCharges = gymCharges;
		this.liquor = liquor;
		this.timeDuration = timeDuration;
		this.hotelName = hotelName;
	}

	public int getPackId() {
		return packId;
	}

	public String getPackageName() {
		return packageName;
	}

	public float getBuffetPrice() {
		return buffetPrice;
	}

	public int getNumberOfMeals() {
		return numberOfMeals;
	}

	public float getPoolCharges() {
		return poolCharges;
	}

	public float getGymCharges() {
		return gymCharges;
	}

	public float getLiquor() {
		return liquor;
	}

	public String getTimeDuration() {
		return timeDuration;
	}

	public String getHotelName() {
		return hotelName;
	}


	
}
