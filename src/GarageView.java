public class GarageView {

	private static GarageLogic gL;

	GarageView() {
		gL = new GarageLogic();
	}

	public void output (TypeOfVehicle type) {
		gL.fastestVehicle(type);
		System.out.format("Pojazd %s producenta %s jest najszybszy (maksymalna prędkość to = %d km/h)\n",
				gL.getType(), gL.getProducer(), gL.getMaxSpeed());
	}
}
