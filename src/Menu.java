import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Menu {

	private final Garage g;
	private static final String car = "CAR";
	private static final String ship = "SHIP";
	private static final String plane = "PLANE";
	private static final String bicycle = "BICYCLE";
	private static final String all = "ALL";
	private static final String exit = "EXIT";
	private static final Logger logger
			= LoggerFactory.getLogger(Menu.class);

	public Menu() {
		g = new Garage();
		showMenu();
	}
	private void showMenu() {
		System.out.println("CAR\nSHIP\nPLANE\nBICYCLE\nALL\nEXIT");
		TypeOfVehicle option = null;
		Scanner sc = new Scanner(System.in);
		try {
			option = TypeOfVehicle.valueOf(sc.nextLine());
		} catch (InputMismatchException e) {
			System.out.println("Podaj prawidłową opcję");
			promptEnterKey();
			showMenu();
		}
		switch(Objects.requireNonNull(option)){
			case CAR:
				logger.info("Wybrana opcja : {}", car);
				g.fastestVehicle(TypeOfVehicle.CAR);
				break;
			case SHIP:
				logger.info("Wybrana opcja : {}", ship);
				g.fastestVehicle(TypeOfVehicle.SHIP);
				break;
			case PLANE:
				logger.info("Wybrana opcja : {}", plane);
				g.fastestVehicle(TypeOfVehicle.PLANE);
				break;
			case BICYCLE:
				logger.info("Wybrana opcja : {}", bicycle);
				g.fastestVehicle(TypeOfVehicle.BICYCLE);
				break;
			case ALL:
				logger.info("Wybrana opcja : {}", all);
				g.fastestVehicle(TypeOfVehicle.ALL);
				break;
			case EXIT:
				logger.info("Wybrana opcja : {}", exit);
				System.exit(0);
				break;
			default:
				System.out.println("Podaj prawidłową opcję");

		}
		promptEnterKey();
		showMenu();
	}

	public void promptEnterKey(){
		System.out.println("Press any key to continue...");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}
}
