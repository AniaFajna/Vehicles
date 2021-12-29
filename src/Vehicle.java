import org.apache.log4j.Logger;

public class Vehicle {

	private final TypeOfVehicle typeName;
	private final String producer;
	private final int maxSpeed;
	private static final Logger logger = Logger.getLogger(Vehicle.class);

	public Vehicle(TypeOfVehicle typeName, int maxSpeed, String producer) {
		logger.info("Vehicle initialization.");
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
