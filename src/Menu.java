
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
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
		System.out.println("1.CAR\n2.SHIP\n3.PLANE\n4.BICYCLE\n5.ALL\n0.EXIT");
		int option = 0;
		Scanner sc = new Scanner(System.in);
		try {
			option = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Podaj prawidłową opcję");
			promptEnterKey();
			showMenu();
		}
		switch(option){
			case 1:
				logger.info("Wybrana opcja : {}", car);
				g.fastestVehicle("CAR");
				break;
			case 2:
				logger.info("Wybrana opcja : {}", ship);
				g.fastestVehicle("SHIP");
				break;
			case 3:
				logger.info("Wybrana opcja : {}", plane);
				g.fastestVehicle("PLANE");
				break;
			case 4:
				logger.info("Wybrana opcja : {}", bicycle);
				g.fastestVehicle("BICYCLE");
				break;
			case 5:
				logger.info("Wybrana opcja : {}", all);
				g.fastestVehicle("ALL");
				break;
			case 0:
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
