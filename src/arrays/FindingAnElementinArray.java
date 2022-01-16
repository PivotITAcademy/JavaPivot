package arrays;

public class FindingAnElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String array
		String[] cities = { "Kingston", "Toronto", "London", "Brampton", "Ottawa", "Mississauga" };

		String cityTobeSearced = "London";
		boolean isCityFound=false;
		
		for (int i = 0; i < cities.length; i++) {
			if(cities[i].equals(cityTobeSearced)) {
				isCityFound=true;
				break;
			}
		}
		
		System.out.println();
	}

}
