import org.apache.log4j.Logger;

import java.util.Scanner;

public class MenuView {

	private static final MenuLogic ml = new MenuLogic();
	private static final Logger logger = Logger.getLogger(MenuView.class);

	public static void startView() {
		System.out.println("CAR\nSHIP\nPLANE\nBICYCLE\nALL\nEXIT");
		decisionView();
	}

	private static void decisionView() {
		try {
			ml.activateMenuLogic();
			promptEnterKey();
			startView();
		} catch (IllegalArgumentException e) {
			logger.error("Picked wrong option.");
			System.out.println("Podana opcja nie istnieje. Podaj prawidłową opcję.");
			decisionView();
		}
	}

	public static void promptEnterKey(){
		System.out.println("Press any key to continue...");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}
}
