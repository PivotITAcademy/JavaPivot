package loopsAsignment;

public class RoomSwitch {

	/*
	 * Design a room switch.
	 * 
	 * Button1 : Fan Button 2: Light Button 3: Light2 Button 4 : AC/Cooler
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Switch

		int button = 2;

		switch (button) {

		case 1: {
			// click on button1
			System.out.println("Fan is turned on");
				break;
		}
		case 2: {
			// click on button2
			System.out.println("Light is turned on");
			break;
		}
		case 3 : {
			System.out.println("Light 2 turned on");
			break;
		}
		case 4 : {
			System.out.println("AC turned on");
			break;
		}

	}

		
	}

}
