import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.Objects;
import java.util.Scanner;

public class MenuLogic {

	private static GarageView gV;
	private static final Logger logger = Logger.getLogger(MenuLogic.class);

	public MenuLogic() {
		DOMConfigurator.configure("log4j.xml");
		logger.info("MenuLogic initialization.");
		gV = new GarageView();
	}

	public void activateMenuLogic() {
		TypeOfVehicle option;
		Scanner sc = new Scanner(System.in);
		option = TypeOfVehicle.valueOf(sc.nextLine());
		switch(Objects.requireNonNull(option)){
			case CAR:
				logger.info("Picked CAR option.");
				gV.output(TypeOfVehicle.CAR);
				break;
			case SHIP:
				logger.info("Picked SHIP option.");
				gV.output(TypeOfVehicle.SHIP);
				break;
			case PLANE:
				logger.info("Picked PLANE option.");
				gV.output(TypeOfVehicle.PLANE);
				break;
			case BICYCLE:
				logger.info("Picked BICYCLE option.");
				gV.output(TypeOfVehicle.BICYCLE);
				break;
			case ALL:
				logger.info("Picked ALL option.");
				gV.output(TypeOfVehicle.ALL);
				break;
			case EXIT:
				logger.info("Picked EXIT option.");
				System.exit(0);
				break;
		}
	}
}
