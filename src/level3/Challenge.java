package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {

		driveDirect(700, 700);
		sleep(1300);
		driveDirect(50, 120);
		sleep(3500);

		driveDirect(600, 600);
		sleep(1500);
		driveDirect(150, 50);
		sleep(2500);

		driveDirect(500, 500);
		sleep(2000);
		driveDirect(50, 150);
		sleep(2800);

		driveDirect(500, 500);
		sleep(1800);
		driveDirect(130, 50);
		sleep(3000);

		driveDirect(1000, 1000);
		sleep(2000);

	}

	public void loop() {

	}
}
