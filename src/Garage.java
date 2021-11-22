import java.util.ArrayList;

public class Garage extends ArrayList<Vehicle> {

	public Garage() {
		Vehicle x5 = new Vehicle("CAR", 220, "BMW");
		Vehicle x6 = new Vehicle("CAR", 260, "BMW");
		Vehicle titanic = new Vehicle("SHIP", 70, "Titanic inc.");
		Vehicle quickBoat = new Vehicle("SHIP", 100, "QuickBoat inc.");
		Vehicle airForce1 = new Vehicle("PLANE", 350, "America inc.");
		Vehicle airForce5 = new Vehicle("PLANE", 420, "America inc.");
		Vehicle bmx = new Vehicle("BICYCLE", 30, "Tony Hawk inc.");
		Vehicle rider = new Vehicle("BICYCLE", 50, "Tony Hawk inc.");

		this.add(x5);
		this.add(x6);
		this.add(titanic);
		this.add(quickBoat);
		this.add(airForce1);
		this.add(airForce5);
		this.add(bmx);
		this.add(rider);
	}

	public void fastestVehicle(String typeOfVehicle) {
		String type = null;
		String producer = null;
		int maxSpeed = 0;

		for (Vehicle v: this) {
			if (v.getType().equals(typeOfVehicle) || typeOfVehicle.equals("ALL")) {
				if (v.getMaxSpeed() > maxSpeed) {
					maxSpeed = v.getMaxSpeed();
					type = v.getType();
					producer = v.getProducer();
				}
			}
		}
		System.out.format("Pojazd %s producenta %s jest najszybszy (maksymalna prędkość to = %d km/h)\n",
				type, producer, maxSpeed);
	}
}
