public class Vehicle {

	private final String type;
	private final String producer;
	private final int maxSpeed;

	public Vehicle(String type, int maxSpeed, String producer) {
		this.type = type;
		this.maxSpeed = maxSpeed;
		this.producer = producer;
	}

	public String getType() {
		return type;
	}

	public String getProducer() {
		return producer;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
}
