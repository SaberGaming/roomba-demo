package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	/**
	 * Without touching the wall reach the endZone use sleep an driveDirect
	 */
	public void initialize() {
		// write code here!

		driveDirect(1000, 1000);
		sleep(1000);
		driveDirect(25, 100);
		sleep(5000);
		driveDirect(10000, 10000);
		sleep(3500);
		driveDirect(25, 350);
		sleep(1000);
		driveDirect(1000, 1000);
		sleep(2000);
	}

	public void loop() {

	}
}
