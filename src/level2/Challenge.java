package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(900, 900);
		sleep(1800);
		driveDirect(20, 80);
		sleep(5500);
		driveDirect(1000, 1000);
		sleep(1900);
		driveDirect(110, 50);
		sleep(5000);
		driveDirect(1000, 1000);

	}

	public void loop() {

	}
}
