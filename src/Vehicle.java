public class Vehicle {

	private final TypeOfVehicle typeName;
	private final String producer;
	private final int maxSpeed;

	public Vehicle(TypeOfVehicle typeName, int maxSpeed, String producer) {
		this.typeName = typeName;
		this.maxSpeed = maxSpeed;
		this.producer = producer;
	}

	public TypeOfVehicle getTypeName() {
		return typeName;
	}

	public String getProducer() {
		return producer;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
}
