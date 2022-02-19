package composition2;

public class Store {
	
	//Store sells TVS
     TV tv;
     
     WashingMachine washingMachine;

	public WashingMachine getWashingMachine() {
		return washingMachine;
	}

	public void setWashingMachine(WashingMachine washingMachine) {
		this.washingMachine = washingMachine;
	}

	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}
     
     
}
