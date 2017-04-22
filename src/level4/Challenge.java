package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	/**
	 * complete the MAZE Hint: use bump sensors
	 */

	public void initialize() {
		driveDirect(1000, 1000);
		sleep(2000);

	}

	int count;

	public void loop() {

		if (isBumpedRight()) {
			driveDirect(-100, -100);
			sleep(1200);
			driveDirect(50, 200);
			sleep(600);
			count++;
			if (count == 5) {
				driveDirect(-100, -100);
				sleep(1200);
				driveDirect(200, 50);
				sleep(600);

			}

		}

		else {
			driveDirect(1000, 1000);

		}
	}
}
