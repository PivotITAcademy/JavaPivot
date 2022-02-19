package composition2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Store store = new Store();
		
		TV tv = new TV();
		
		tv.setBrand("LG");
		tv.setSize("55 inches");
		
		store.setTv(tv);
		
		WashingMachine washingMachine = new WashingMachine();
		washingMachine.setWmbrand("Whirlpool");
		
		store.setWashingMachine(washingMachine);
		
		String washingMachineBrand = store.getWashingMachine().getWmbrand();
		
		System.out.println("Washing machine available in store : "+washingMachineBrand);
		
		//Get information about TV
		System.out.println("TV Brand : "+store.getTv().getBrand());
		
		System.out.println("TV size "+store.getTv().getSize());
	}

}
