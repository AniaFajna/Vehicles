import org.apache.log4j.Logger;

import java.util.ArrayList;

public class GarageLogic extends ArrayList<Vehicle> {

	private static final Logger logger = Logger.getLogger(GarageLogic.class);
	private TypeOfVehicle type;
	private String producer;
	private int maxSpeed;

	public GarageLogic() {
		logger.info("Garage initialization.");
		Vehicle x5 = new Vehicle(TypeOfVehicle.CAR, 220, "BMW");
		Vehicle x6 = new Vehicle(TypeOfVehicle.CAR, 260, "BMW");
		Vehicle titanic = new Vehicle(TypeOfVehicle.SHIP, 70, "Titanic inc.");
		Vehicle quickBoat = new Vehicle(TypeOfVehicle.SHIP, 100, "QuickBoat inc.");
		Vehicle airForce1 = new Vehicle(TypeOfVehicle.PLANE, 350, "America inc.");
		Vehicle airForce5 = new Vehicle(TypeOfVehicle.PLANE, 420, "America inc.");
		Vehicle bmx = new Vehicle(TypeOfVehicle.BICYCLE, 30, "Tony Hawk inc.");
		Vehicle rider = new Vehicle(TypeOfVehicle.BICYCLE, 50, "Tony Hawk inc.");

		this.add(x5);
		this.add(x6);
		this.add(titanic);
		this.add(quickBoat);
		this.add(airForce1);
		this.add(airForce5);
		this.add(bmx);
		this.add(rider);
	}

	public void fastestVehicle(TypeOfVehicle typeName) {
		type = null;
		producer = null;
		maxSpeed = 0;

		for (Vehicle v: this) {
			if (v.getTypeName().equals(typeName) || typeName.equals(TypeOfVehicle.ALL)) {
				if (v.getMaxSpeed() > maxSpeed) {
					type = v.getTypeName();
					producer = v.getProducer();
					maxSpeed = v.getMaxSpeed();
				}
			}
		}
	}

	public TypeOfVehicle getType() { return type;	}

	public String getProducer() { return producer;	}

	public int getMaxSpeed() { return maxSpeed;	}
}
